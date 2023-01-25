package br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
            curso1.setTitulo("curso java");
               curso1.setDescricao("descrição curso java");
                  curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
           curso2.setTitulo("curso js");
              curso2.setDescricao("descrição curso js");
                 curso2.setCargaHoraria(8);

         Conteudo conteudo = new Curso();
         Conteudo conteudo1 = new Mentoria();


        Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("mentoria de java");
               mentoria.setDescricao("descrição mentoria java");
                  mentoria.setData(LocalDate.now());


       System.out.println(curso1);
       System.out.println(curso2);
       System.out.println(mentoria);

        Bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.setconteudos().add(curso1);
        bootcamp.setConteudos().add(curso2);
        bootcamp.setConteudos().add(mentoria);

        Dev devThais = new Dev();
          devThais.setNome("Thais");
            devThais.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Instritos Thais" + devThais.getConteudosInscritos());
            devThais.progredir();
        System.out.println("Conteúdos concluidos Thais" + devThais.getConteudosConcluidos();
        System.out.println("XP:" + devThais.calcularTotalXp());

        Dev devRenato = new Dev();
           devRenato.setNome("Renato");
             devThais.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Instritos" + devRenato.getConteudosInscritos());
              devRenato.progredir();
              devRenato.progredir();
              devRenato.progredir();
        System.out.println("Conteúdos concluidos Renato" + devRenato.getConteudosConcluidos();
        System.out.println("XP:" + devRenato.calcularTotalXp());

    }
    }
