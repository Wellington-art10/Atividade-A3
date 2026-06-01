package com.mycompany.sistemagestaoprojetos;

    import java.util.ArrayList;
import java.util.Locale;
    import java.util.Scanner;
public class SistemaGestaoProjetos {

    public static void main(String[] args) {
      Scanner entrada= new Scanner(System.in);
     
      ArrayList<Usuario> usuario = new ArrayList<>();
      ArrayList<Projeto> projeto = new ArrayList<>();
      ArrayList<Equipe> equipes = new ArrayList<>();
        try{
      System.setOut(new java.io.PrintStream(System.out, true, "UTF-8")); //
        } catch (Exception e) {}
      
       int opcao;
       do {
          System.out.println("===SISTEMA DE GERENCIMENTO ===");
          System.out.println("1 - Usuarios");
          System.out.println("2 - Projetos");
          System.out.println("3 - Equipes");
          System.out.println("4 - Sair");
          System.out.print("Escolha uma das opçao: ");
          opcao = entrada.nextInt();
           entrada.nextLine(); // limpar buffet
             
           if(opcao== 1){
               int opcaoUsuario;
                do {
                   System.out.println("=== USUARIOS ===");
                   System.out.println("1 - Cadastrar");
                   System.out.println("2 - Listar");
                   System.out.println("3 - Atualizar");
                   System.out.println("4 - Excluir");
                   System.out.println("5 - Voltar");
                   System.out.print("Escolha: ");
                   opcaoUsuario =entrada.nextInt();
                   entrada.nextLine();
                   
               if(opcaoUsuario == 1){
               System.out.println("=== CADASTRAR USUARIO ===");
               System.out.println("Nome: ");
               String nome= entrada.nextLine();
               String cpf = "";
               do{
                   System.out.print("CPF (11 digitos): ");
                   cpf = entrada.nextLine();
                   if(cpf.length() !=11){
                       System.out.println("CPF invalido! Digite 11 digitos.");
                   }
               }while(cpf.length() !=11);
              String email= "";
              do{
                  System.out.print("Email: ");
                  email = entrada.nextLine();
                  if(!email.contains("@") || !email.contains(".")){
                      System.out.println("Email invalido!");
                  }
              }while(!email.contains("@") || !email.contains("."));
               System.out.println("Cargo: ");
               String cargo= entrada.nextLine();
               System.out.println("Login: ");
               String login= entrada.nextLine();
               System.out.println("Senha: ");
               String senha= entrada.nextLine();
              String perfil = "";
              do{
              System.out.println("Perfil: ");
              System.out.println("1 - administrador");
              System.out.println("2 - gerente");
              System.out.println("3 - colaborador");
              System.out.print("Escolha: ");
              int opcaoPerfil = entrada.nextInt();
              entrada.nextLine();
              if(opcaoPerfil == 1) perfil = "administrador";
              else if(opcaoPerfil == 2) perfil = "gerente";
              else if(opcaoPerfil == 3) perfil = "colaborador";
              else System.out.println("opcao invalida!");
               }while(perfil.isEmpty());
               int id= usuario.size() + 1;
               Usuario u = new Usuario(id, nome, cpf, email, cargo, login, senha, perfil);
               usuario.add(u);
               System.out.println("Cadastrado com sucesso!");
               
             }
               if(opcaoUsuario == 2){
                   for(Usuario u : usuario){
                       u.exibir();
                   }
               } 
               if (opcaoUsuario == 3){
                   System.out.print("Digite o ID do usuario a atualizar: ");
                   int idAtualizar = entrada.nextInt();
                   entrada.nextLine();
                    
                   boolean encontrado = false;
                   
                   for (Usuario u : usuario) {
                       if (u.getId() == idAtualizar) {
                           System.out.print("Novo nome: ");
                           u.setNome(entrada.nextLine());
                           System.out.print("Novo email: ");
                           u.setEmail(entrada.nextLine());
                           System.out.print("Novo cargo: ");
                           u.setCargo(entrada.nextLine());
                           System.out.println("Atualizado com sucesso!");
                           encontrado = true;
                                   break;
                       }
                   }
                   if(!encontrado){
                       System.out.println("Usuário com ID" + idAtualizar + " não encontrado");
                         
                       }
                   }
               if(opcaoUsuario ==4){
                   System.out.print("ID do usuario: ");
                   int idExcluir = entrada.nextInt();
                   entrada.nextLine();
                   usuario.removeIf(u -> u.getId() == idExcluir);
                   System.out.println("Excluido com sucesso!");
                       
               }
               
                   }while(opcaoUsuario != 5);
           }
           if(opcao ==2){
               int opcaoProjeto;
               do{
                   System.out.println("=== PROJETOS ===");
                   System.out.println("1 - Cadastrar");
                   System.out.println("2 - Listar");
                   System.out.println("3 - Atualizar");
                   System.out.println("4 - Excluir");
                   System.out.println("5 - Relatorio de acompanhamento");
                   System.out.println("6 - Voltar");
                   System.out.println("Escolha: ");
                   opcaoProjeto = entrada.nextInt();
                   entrada.nextLine();
                    
                   if(opcaoProjeto == 1){
                   
                   System.out.println("Nome: ");
                   String nome = entrada.nextLine();
                   System.out.println("Descricao: ");
                   String descricao = entrada.nextLine();
                   System.out.println("Responsavel: ");
                   String responsavel = entrada.nextLine();
                   String dataInicio = "";
                   do{
                       System.out.print("Data Inicio (dd/mm/aaaa): ");
                       dataInicio = entrada.nextLine();
                       if (dataInicio.length() != 10 || dataInicio.charAt(2) != '/' || dataInicio.charAt (5) != '/'){
                           System.out.println("Data invalida! use o formato dd/mm/aaaa");
                       }
                       }while(dataInicio.length() != 10 || dataInicio.charAt(2) != '/' || dataInicio.charAt(5) != '/');
                       String dataTermino = "";
                       do{
                           System.out.print("Data termino (dd/mm/aaaa): ");
                           dataTermino = entrada.nextLine();
                           if(dataTermino.length() !=10 || dataTermino.charAt(2) != '/' || dataTermino.charAt(5) !='/'){
                           System.out.println("Data invalida! Use o foramato dd/mm/aaaa");
                       }
                   }while(dataTermino.length() !=10 || dataTermino.charAt(2) !='/' || dataTermino.charAt(5) !='/');
                    String status = "";
                   do{
                       System.out.println("Status: ");
                       System.out.println("1 -planejado");
                       System.out.println("2 - em andamento");
                       System.out.println("3 - concluido");
                       System.out.println("4 - cancelado");
                       System.out.print("Escolha: ");
                       int opcaoStatus = entrada.nextInt();
                       entrada.nextLine();
                       if(opcaoStatus == 1) status = "planejado";
                       else if(opcaoStatus == 2) status = "em andamento";
                       else if(opcaoStatus == 3) status = "concluido";
                       else if(opcaoStatus == 4) status = "cancelado";
                       else System.out.println("Opcao invalida");
                   }while(status.isEmpty());
                   int id = projeto.size( ) + 1;
                   Projeto p = new Projeto(id, nome, descricao, responsavel, dataInicio, dataTermino,status);
                   projeto.add(p);
                   System.out.println("Cadastrado com sucesso!");
               }
               if(opcaoProjeto == 2){
                   for(Projeto p : projeto){
                       p.exibir();
                   }
               }
               if (opcaoProjeto == 3){
                   System.out.print("Digite o ID do usuario a atualizar: ");
                   int idAtualizar = entrada.nextInt();
                   entrada.nextLine();
                    
                   boolean encontrado = false;
                   
                   for (Projeto p : projeto) {
                       if (p.getId() == idAtualizar) {
                           System.out.print("Novo nome: ");
                           p.setNome(entrada.nextLine());
                           System.out.print("Nova descricao: ");
                           p.setDescricao(entrada.nextLine());
                           System.out.print("Novo responsavel: ");
                           p.setResponsavel(entrada.nextLine());
                           System.out.println("Atualizado com sucesso!");
                           encontrado = true;
                                   break;
                       }
                   }
                   if(!encontrado){
                       System.out.println("Projeto com ID" + idAtualizar + " não encontrado");
                         
                       }
                   }
               if(opcaoProjeto ==4){
                   System.out.print("ID do Projeto: ");
                   int idExcluir = entrada.nextInt();
                   entrada.nextLine();
                   usuario.removeIf(u -> u.getId() == idExcluir);
                   System.out.println("Excluido com sucesso!");
               }
               if (opcaoProjeto == 5){
                   System.out.println("=== RELATORIO DE ACOMPANHAMENTO ===");
                   for(Projeto p: projeto){
                       p.exibir();
                       System.out.println("-------------------------------");
                   }
               }
           }while(opcaoProjeto != 6);
              }
               if(opcao == 3){
                  int opcaoEquipe;
               do{
                   System.out.println(" === EQUIPES ===");
                   System.out.println("1 - Cadastrar ");
                   System.out.println("2 - Listar");
                   System.out.println("3 - Adicionar Membro");
                   System.out.println("4 - vincular a Projeto");
                   System.out.println("5 - Atualizar");
                   System.out.println("6 - Excluir");
                   System.out.println("7 - voltar");
                   System.out.print("Escolha: ");
                   opcaoEquipe = entrada.nextInt();
                   entrada.nextLine();
                   
                   if(opcaoEquipe == 1){
                       System.out.print("Nome: ");
                       String nome = entrada.nextLine();
                       System.out.println("Descricao: ");
                       String Descricao =entrada.nextLine();
                       int id = equipes.size() + 1;
                       Equipe e = new Equipe(id, nome, Descricao);
                       equipes.add(e);
                       System.out.println("Cadastrado com sucesso!");
                   }
                   if(opcaoEquipe == 2){
                       for(Equipe e : equipes){
                           e.exibir();
                       }
                   }
                   if (opcaoEquipe == 5){
                   System.out.print("Digite o ID da equipe a atualizar: ");
                   int idAtualizar = entrada.nextInt();
                   entrada.nextLine();
                    
                   boolean encontrado = false;
                   
                   for (Equipe e : equipes) {
                       if (e.getId() == idAtualizar) {
                           System.out.print("Novo nome: ");
                           e.setNome(entrada.nextLine());
                           System.out.print("Novo descricao: ");
                           e.setDescricao(entrada.nextLine());
                           System.out.println("Atualizado com sucesso!");
                           encontrado = true;
                                   break;
                       }
                   }
                   if(!encontrado){
                       System.out.println("Equipe com ID" + idAtualizar + " não encontrado");
                         
                       }
                   }
               if(opcaoEquipe ==6){
                   System.out.print("ID do equipe: ");
                   int idExcluir = entrada.nextInt();
                   entrada.nextLine();
                   usuario.removeIf(u -> u.getId() == idExcluir);
                   System.out.println("Excluido com sucesso!");
                       
               }
                   if(opcaoEquipe == 3){
                       System.out.print("ID da equipe: ");
                       int idEquipe = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("ID: do usuario: ");
                        int idUsuario = entrada.nextInt();
                        entrada.nextLine();
                        
                        Equipe equipeEscolhida  = null;
                        for(Equipe e: equipes){
                            if(e.getId( )== idEquipe){
                                equipeEscolhida = e;
                            }
                        }
                        Usuario usuarioEscolhido = null;
                        for(Usuario u : usuario){
                            if( u. getId() == idUsuario){
                                usuarioEscolhido = u;
                            }
                        }
                        if(equipeEscolhida != null && usuarioEscolhido != null){
                            equipeEscolhida.adicionarMembro(usuarioEscolhido);
                            System.out.println("Membro adicionado com sucesso!");
                        } else {
                            System.out.println("Equipe ou usuario nao encontrado!");
                            
                            }
                       }
                   if(opcaoEquipe ==4){
                       System.out.print("ID da equipe: ");
                       int idEquipe = entrada.nextInt();
                       entrada.nextLine();
                       System.out.print("ID do projeto: ");
                       int idProjeto = entrada.nextInt();
                       entrada.nextLine();
                       Equipe equipeEscolhida = null;
                       for(Equipe e : equipes){
                           if(e.getId() == idEquipe){
                               equipeEscolhida = e;
                           }
                       }
                         Projeto projetoEscolhido = null;
               for(Projeto p : projeto){
                   if(p.getId() == idProjeto){
                       projetoEscolhido = p;
                   }
               }
               if(equipeEscolhida != null && projetoEscolhido != null){
                   equipeEscolhida.adicionarProjeto(projetoEscolhido);
                   System.out.println("vinculado com sucesso!");
               } else {
                   System.out.println("Equipe ou projeto nao encontrado!");
               }
           }
       }while(opcaoEquipe != 7);
               }
           
       }while(opcao != 4);
                   System.out.println("Programa finalizado!");
                   entrada.close();
          }
       }
       
            

          
       
