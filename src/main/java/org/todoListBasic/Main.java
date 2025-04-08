package org.todoListBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();
        Scanner scan = new Scanner(System.in);



        outer:
        while (true) {


            System.out.println("[1] Adicionar tarefa");
            System.out.println("[2] Editar tarefa");
            System.out.println("[3] Exibir tarefas");
            System.out.println("[4] Remover tarefa");
            System.out.println("[5] Salvar tarefas");
            System.out.println("[6] Sair");
            System.out.print("Selecione a operação: ");
            int choice = scan.nextInt();

            switch (choice){

                case 1:
                    System.out.print("Digite o nome da tarefa:");
                    String name = scan.next();

                    System.out.print("Digite uma descrição para a tarefa:");
                    scan.nextLine();
                    String description = scan.nextLine();

                    System.out.print("Selecione a prioridade:\n[1] Alta\n[2]baixa\n[3]alta\nResposta: ");
                    int priorityChoice = scan.nextInt();

                    Priority priorty;
                    if (priorityChoice == 1){
                        priorty = Priority.MAIN_TASKS;
                    } else{
                        priorty = (priorityChoice == 2) ? Priority.SECONDARY_TASKS:Priority.OPTIONAL_TASKS;
                    }

                    Task task = new Task(name, description, priorty, (tasks.size()+1));
                    tasks.add(task);
                    break;

                case 2:
                    System.out.println("Selecione o id da tarefa que será editada:");
                    int idTask = scan.nextInt();
                    for (Task _tasks:tasks){

                        if (_tasks.getId() == idTask){
                            System.out.println("Digite o que será editado\n[1]Nome\n[2]Descrição\n[3]Prioridade\nEscolha: ");
                            int editChoice = scan.nextInt();
                            if (editChoice == 1){
                                System.out.println("Digite o novo nome da tarefa: ");
                                String newTaskName = scan.next();
                                _tasks.changeName(newTaskName);

                            } else if (editChoice == 2){

                                System.out.print("Digite a nova descrição: ");
                                String newTaskDescription = scan.nextLine();
                                _tasks.changeDescription(newTaskDescription);

                            } else{

                                System.out.print("Digite a nova prioridade da tarefa\n[1]Alta\n[2]Baixa\n[3]Opcional\nEscolha: ");
                                int newPriorityChoice = scan.nextInt();

                                if (newPriorityChoice == 1){

                                    _tasks.changePriority(Priority.MAIN_TASKS);

                                } else if(newPriorityChoice == 2){
                                    _tasks.changePriority(Priority.SECONDARY_TASKS);

                                } else{

                                    _tasks.changePriority(Priority.OPTIONAL_TASKS);
                                }

                            }


                        }
                    }
                    break;

                case 3:
                    for (Task _tasks: tasks){
                        System.out.println(_tasks);
                    }
                    break;

                case 4:
                    System.out.print("Selecione o id da tarefa que será removida: ");
                    int removeTask = scan.nextInt();
                    for (Task _task:tasks){
                        if (_task.getId() == removeTask){
                            tasks.remove(_task);
                            System.out.print("Tarefa removida com sucesso!");
                        }
                        break;
                    }



            }

        }












    }


}
