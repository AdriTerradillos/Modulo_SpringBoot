package es.curso.test;

import java.util.List;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.ApplicationContext;

import es.curso.modelo.entidades.Piano;
import es.curso.modelo.entidades.Teclado;
import es.curso.modelo.negocio.GestorPiano;



// hacemos las importaciones correspondientes



public class TestPiano {
    
    public static void main(String[] args) {
        AnnottationConfigApplicationContext 
        context = new AnnottationConfigApplicationContext(AppConfigurationEntry.class);
    }


    GestorPiano gestor = Context.getBean(GestorPiano.class);
Piano piano = CacheAnnotationParserontext.getBean(Piano.class);
Teclado teclado = Context.getBean(Teclado.class);

    // crearemos algunos teclados
    Teclado teclado1 = Context.getBean(Teclado.class);
    teclado1.setTeclas(88);

    Teclado teclado2 = Context.getBean(Teclado.class);
    teclado2.setTeclas(86);

    Teclado teclado3 = Context.getBean(Teclado.class);
    teclado3.setTeclas(88);

    Teclado teclado4 = Context.getBean(Teclado.class);
    teclado4.setTeclas(86);

    Teclado teclado5 = Context.getBean(Teclado.class);
    teclado5.setTeclas(70);

    Teclado teclado6 = Context.getBeans(Teclado.class);
    teclado6.setTeclas(88);

    Teclado teclado7 = Context.getBean(Teclado.class);
    teclado7.setTeclas(86);

    Teclado teclado8 = Context.getBean(Teclado.class);
    teclado8.setTeclas(88);

    Teclado teclado9 = Context.getBean(Teclado.class);
    teclado9.setTeclas(70);

    Teclado teclado10 = Context.getBean(Teclado.class);
    teclado10.setTeclas(88);

    Teclado teclado11 = Context.getBean(Teclado.class);
    teclado5.setTeclas(70);

    Teclado teclado12 = Context.getBeans(Teclado.class);
    teclado6.setTeclas(88);

    Teclado teclado13 = Context.getBean(Teclado.class);
    teclado7.setTeclas(86);

    Teclado teclado14 = Context.getBean(Teclado.class);
    teclado8.setTeclas(88);

    Teclado teclado15 = Context.getBean(Teclado.class);
    teclado9.setTeclas(70);


    // vamos a crear y agregar ahora los 15 pianos con todos los atributos


    Piano piano1 = Context.getBean(Piano.class);
    piano1.setMarca("Yamaha");
    piano1.setModelo("Clavinova CLP-745");
    piano1.setPrecio("2500.00");
    piano1.setPais("Japon");
    piano1.setFechaDeLanzamiento(new Date(122, 05, 12));   // Año 2022
    piano1.setColor("Ebano pulido");
    piano1.setTeclas(java.util.Arrays.asList(teclado1));
    gestor.agregar(piano1);


    Piano piano2 = Context.getBean(Piano.class);
    piano2.setMarca("Kawai");
    piano2.setModelo("Kawai K200 Chrome");
    piano2.setPrecio("6264.00");
    piano2.setPais("Japon");
    piano2.setFechaDeLanzamiento(new Date(118, 01, 10));   // Año 2018
    piano2.setColor("Negro satinado");
    piano2.setTeclas(java.util.Arrays.asList(teclado2));


    Piano piano3 = Context.getBean(Piano.class);
    piano3.setMarca("Kawai");
    piano3.setModelo("Kawai K200");
    piano2.setPrecio("6264.00");
    piano2.setPais("Japon");
    piano2.setFechaDeLanzamiento(new Date(123, 06, 9));   // Año 2023
    piano2.setColor("Ebano pulido");
    piano3.setTeclas(java.util.Arrays.asList(teclado3));

    Piano piano4 = Context.getBean(Piano.class);
    piano4.setMarca("Yamaha");
    piano4.setModelo("Yamaha P-515 B");
    piano2.setPrecio("1899.00");
    piano2.setPais("Japon");
    piano2.setFechaDeLanzamiento(new Date(125, 06, 10));   // Año 2025
    piano2.setColor("Nogal Satinado");
    piano4.setTeclas(java.util.Arrays.asList(teclado4));

    
    Piano piano5 = Context.getBean(Piano.class);
    piano5.setMarca("Samick");
    piano5.setModelo("Samick SIG-61 D");
    piano2.setPrecio("21080.89");
    piano2.setPais("Corea del Sur");
    piano2.setFechaDeLanzamiento(new Date(123, 06, 11));   // Año 2023
    piano2.setColor("Ebano mate");
    piano5.setTeclas(java.util.Arrays.asList(teclado5));


    Piano piano6 = Context.getBean(Piano.class);
    piano6.setMarca("Schimmel");
    piano6.setModelo("Schimmel C116 Tradition");
    piano2.setPrecio("15000.00");
    piano2.setPais("Alemania");
    piano2.setFechaDeLanzamiento(new Date(123, 1, 1));   // Año 2023
    piano2.setColor("Negro clasico");
    piano6.setTeclas(java.util.Arrays.asList(teclado6));
    

    Piano piano7 = Context.getBean(Piano.class);
    piano7.setMarca("Young Chang");
    piano7.setModelo("Young Chang U109");
    piano2.setPrecio("4500.00");
    piano2.setPais("Corea");
    piano2.setFechaDeLanzamiento(new Date(124, 06, 3));   // Año 2024
    piano2.setColor("Caoba");
    piano7.setTeclas(java.util.Arrays.asList(teclado7));


    Piano piano8 = Context.getBean(Piano.class);
    piano8.setMarca("Petrof");
    piano8.setModelo("ANT. Petrof 126");
    piano2.setPrecio("10000.00");
    piano2.setPais("Republica Checa");
    piano2.setFechaDeLanzamiento(new Date(121, 06, 9));   // Año 2021
    piano2.setColor("Negro clasico");
    piano8.setTeclas(java.util.Arrays.asList(teclado8));


    Piano piano9 = Context.getBean(Piano.class);
    piano9.setMarca("Seiler");
    piano9.setModelo("Seiler 116 Konsole");
    piano2.setPrecio("14190.00");
    piano2.setPais("Alemania");
    piano2.setFechaDeLanzamiento(new Date(125, 04, 8));   // Año 2025
    piano2.setColor("Plateado madera");
    piano8.setTeclas(java.util.Arrays.asList(teclado9));


    Piano piano10 = Context.getBean(Piano.class);
    piano10.setMarca("Kohler & Campbell")
    piano10.setModelo("KC 131");
    piano2.setPrecio("7900.00");
    piano2.setPais("Canada");
    piano2.setFechaDeLanzamiento(new Date(125, 07, 10));   // Año 2025
    piano2.setColor("Plateado madera");
    piano10.setTeclas(java.util.Arrays.asList(teclado10));


    Piano piano11 = Context.getBean(Piano.class);
    piano11.setMarca("Moutrie");
    piano11.setModelo("M-155-BK");
    piano2.setPrecio("11450.00");
    piano2.setPais("China");
    piano2.setFechaDeLanzamiento(new Date(124, 05, 03));   // Año 2024
    piano2.setColor("Caoba oscuro");
    piano11.setTeclas(java.util.Arrays.asList(teclado11));


    Piano piano12 = Context.getBean(Piano.class);
    piano12.setMarca("Kemble");
    piano12.setModelo("Kemble Cambridge 112");
    piano2.setPrecio("11900.00");
    piano2.setPais("Reino Unido");
    piano2.setFechaDeLanzamiento(new Date(123, 02, 11));   // Año 2023
    piano2.setColor("Negro clasico");
    piano12.setTeclas(java.util.Arrays.asList(teclado12));


    Piano piano13 = Context.getBean(Piano.class);
    piano13.setMarca("Hailun");
    piano13.setModelo("Hailun-120J MSRP");
    piano2.setPrecio("15901.00");
    piano2.setPais("China");
    piano2.setFechaDeLanzamiento(new Date(122, 01, 11));   // Año 2022
    piano2.setColor("Negro ebano");
    piano13.setTeclas(java.util.Arrays.asList(teclado13));


    Piano piano14 = Context.getBean(Piano.class);
    piano14.setMarca("Pearl River");
    piano14.setModelo("PR GP170");
    piano2.setPrecio("9800.00");
    piano2.setPais("China");
    piano2.setFechaDeLanzamiento(new Date(120, 02, 07));   // Año 2020
    piano2.setColor("Caoba oscuro");
    piano14.setTeclas(java.util.Arrays.asList(teclado14));


    Piano piano15 = Context.getBean(Piano.class);
    piano15.setMarca("Steingraeber & Sôhne");
    piano15.setModelo("S&S 130 T");
    piano2.setPrecio("41049.34");
    piano2.setPais("Alemania");
    piano2.setFechaDeLanzamiento(new Date(119, 04, 03));   // Año 2019
    piano2.setColor("Negro clasico"); 
    piano15.setTeclas(java.util.Arrays.asList(teclado15));


    // ahora, agregamos los pianos a la lista

    gestor.agregar(piano1);
    gestor.agregar(piano2);
    gestor.agregar(piano3);
    gestor.agregar(piano4);
    gestor.agregar(piano5);
    gestor.agregar(piano6);
    gestor.agregar(piano7);
    gestor.agregar(piano8);
    gestor.agregar(piano9);
    gestor.agregar(piano10);
    gestor.agregar(piano11);
    gestor.agregar(piano12);
    gestor.agregar(piano13);
    gestor.agregar(piano14);
    gestor.agregar(piano15);


    // Listamos los pianos dentro de la lista (o colección)
    // Emitimos un mensaje inicial, por orden y limpieza

    System.out.println("Lista de pianos: ");

    List<Piano> pianos = gestor.listarPianos();
    for (Piano piano : pianos) {
        System.out.println(piano);
    }
    


    // Obtenemos un piano por Id

    Piano pianoEncontrado = gestor.get(1);
    System.out.println("\nPiano con el Id 1:");
    System.out.println(pianoEncontrado);


    // Para eliminar un piano...

    gestor.borrar(2);
    System.out.println("\nLista de pianos después de eliminar el piano con Id 2: ");
    pianos = gestor.listarPianos();
        System.out.println(piano);
    }

