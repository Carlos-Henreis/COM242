package Controladores;

import Limites.LimiteCadastroPessoa;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.AddressBookProtos;
import model.AddressBookProtos.Person;

public class Controlador {
    int escolha = 0;
    LimiteCadastroPessoa limCad;
    ArrayList<Person> listaPessoas = new ArrayList<>();
    
    public Controlador()
    {
        String combo[] = {"SIM","NÃO"};
        String dados[];
        recuperar(listaPessoas);
        
        do{
            limCad = new LimiteCadastroPessoa();
            dados = limCad.obterDados();
            Person john =
            Person.newBuilder()
              .setId(Integer.parseInt(dados[0]))
              .setName(dados[1])
              .setEmail(dados[2])
              .addPhones(
                Person.PhoneNumber.newBuilder()
                  .setNumber(dados[3])
                  .setType(Person.PhoneType.MOBILE))
              .build();
            listaPessoas.add(john);
            escolha = JOptionPane.showOptionDialog(null, "Deseja continuar?", "mensagem do sistema", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, combo, null);
        }while(escolha == 0);
        
        for(Person billy : listaPessoas)
        {
            System.out.println("----------------------"+billy.getName()+"----------------------");
            System.out.println("ID: "+billy.getId());
            System.out.println("Email: "+billy.getEmail());
            System.out.println("Celular: "+billy.getPhones(0));
        }
        
        persistir(listaPessoas);
    }
    
    public void persistir(ArrayList<Person> pessoas)
    {
        AddressBookProtos.AddressBook.Builder comp = AddressBookProtos.AddressBook.newBuilder();
        try
        {
            FileOutputStream output = new FileOutputStream(new File("dados"));
            for(Person p:pessoas)
            {
                comp.addPeople(p);
            }
            
            comp.build().writeTo(output);
            output.close();
        }catch(Exception exc){
            System.out.println("Não foi possivel persistir em arquivo!s");
        }
    }
    
    public void recuperar(ArrayList<Person> pessoas)
    {
        File arquivo = new File("dados");
        if(arquivo.exists())
        {
            AddressBookProtos.AddressBook.Builder comp = AddressBookProtos.AddressBook.newBuilder();
            try {
                comp.mergeFrom(new FileInputStream(arquivo));
            }catch(Exception e){
                System.out.println("AHHHHHHH NÃO ACHEI O ARQUIVO :/ :/ :/");
            }
            
            int qtd = comp.getPeopleCount();
            for(int i=0 ; i<qtd ; i++)
            {
                pessoas.add(comp.getPeople(i));
            }
            
            System.out.println("RECUPERADO!");
        }
        else
        {
            System.out.println("Arquivo de dados não encontrado!");
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        new Controlador();
    }
}
