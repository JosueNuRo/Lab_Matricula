/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import Control.ControlConsola;
import LogicaDeNegocio.Alumno;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Yenny
 */
public class Consola {
    //ATRIBUTOS
    Alumno alumno = new Alumno();
    ControlConsola control = new ControlConsola();
    Scanner scanner = new Scanner(System.in);
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    boolean salir = false;
    int opcion; 
    
    //Atributos Alumno
    private String idAlumno,nombreAlumno,telefonoAlumno,emailAlumno,fechaNacimiento,carreraAlumno,usuarioAlumno = "";
    //Atributos Profesor
    private String idProfesor,nombreProfesor,telefonoProfesor,emailProfesor,usuarioProfesor = "";
    //Atributos Carrera
     private String codigoCarrera,nombreCarrera,titulo = "";
    //Atributos Curso
    private String codigoCurso,nombreCurso = "";
    private int creditos, horasSemanales = 0;
    
    public Consola() throws SQLException, IOException, NoDataException, GlobalException{
    }
    
    public void menuPrincipal(){
        while(!salir){
            System.out.println("\n*************************************************");
            System.out.println("\n\tSistema de Matrícula Universitaria\n");
            System.out.println("*************************************************");
            System.out.println("1. Mantenimiento de Alumnos");
            System.out.println("2. Mantenimiento de Profesores");
            System.out.println("3. Mantenimiento de Carreras");
            System.out.println("4. Mantenimiento de Cursos");
            System.out.println("5. Salir");

            try{
                System.out.println("\nIngrese una opción: ");
                opcion = scanner.nextInt();

                switch(opcion){
                   case 1:
                       menuMantAlumno();
                       break;
                   case 2:
                       menuMantProfesor();
                       break;
                    case 3:
                       menuMantCarrera();
                       break;
                    case 4:
                       menuMantCurso();
                       break;
                    case 5:
                       salir=true;
                       break;
                    default:
                       System.out.println("Solo se permiten números entre 1 y 5");
                }
            }catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            }
        }
    }
    
    public void menuMantAlumno(){
        while(!salir){
            System.out.println("\n*************************************************");
            System.out.println("\n\tMantenimiento de Alumnos\n");
            System.out.println("*************************************************");
            System.out.println("1. Listar Alumnos");
            System.out.println("2. Ingresar Alumno");
            System.out.println("3. Eliminar Alumno");
            System.out.println("4. Buscar Alumno");
            System.out.println("5. Modificar Alumno");
            System.out.println("6. Volver al Menú Principal");

            try{
                System.out.println("\nIngrese una opción: ");
                opcion = scanner.nextInt();

                switch(opcion){
                   case 1:
                       break;
                   case 2:
                       ingresarAlumno();
                       break;
                    case 3:
                       eliminarAlumno();
                       break;
                    case 4:
                       
                       break;
                    case 5:
                       break;
                    case 6:
                       menuPrincipal();
                       break;
                    default:
                       System.out.println("Solo se permiten números entre 1 y 6");
                }
            }catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            }
        }
    }
    
    public void menuMantProfesor(){
        while(!salir){
            System.out.println("\n*************************************************");
            System.out.println("\n\tMantenimiento de Profesores\n");
            System.out.println("*************************************************");
            System.out.println("1. Listar Profesores");
            System.out.println("2. Ingresar Profesor");
            System.out.println("3. Eliminar Profesor");
            System.out.println("4. Buscar Profesor");
            System.out.println("5. Modificar Profesor");
            System.out.println("6. Volver al Menú Principal");

            try{
                System.out.println("\nIngrese una opción: ");
                opcion = scanner.nextInt();

                switch(opcion){
                   case 1:
                       break;
                   case 2:
                       ingresarProfesor();
                       break;
                    case 3:
                        eliminarProfesor();
                       break;
                    case 4:
                       
                       break;
                    case 5:
                       break;
                    case 6:
                       menuPrincipal();
                       break;
                    default:
                       System.out.println("Solo se permiten números entre 1 y 6");
                }
            }catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            }
        }
    }
    
    public void menuMantCarrera(){
        while(!salir){
            System.out.println("\n*************************************************");
            System.out.println("\n\tMantenimiento de Carreras\n");
            System.out.println("*************************************************");
            System.out.println("1. Listar Carreras");
            System.out.println("2. Ingresar Carrera");
            System.out.println("3. Eliminar Carrera");
            System.out.println("4. Buscar Carrera");
            System.out.println("5. Modificar Carrera");
            System.out.println("6. Volver al Menú Principal");

            try{
                System.out.println("\nIngrese una opción: ");
                opcion = scanner.nextInt();

                switch(opcion){
                   case 1:
                       break;
                   case 2:
                       ingresarCarrera();
                       break;
                    case 3:
                       eliminarCarrera();
                       break;
                    case 4:
                       
                       break;
                    case 5:
                       break;
                    case 6:
                       menuPrincipal();
                       break;
                    default:
                       System.out.println("Solo se permiten números entre 1 y 6");
                }
            }catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            }
        }
    }
    
    public void menuMantCurso(){
        while(!salir){
            System.out.println("\n*************************************************");
            System.out.println("\n\tMantenimiento de Cursos\n");
            System.out.println("*************************************************");
            System.out.println("1. Listar Cursos");
            System.out.println("2. Ingresar Curso");
            System.out.println("3. Eliminar Curso");
            System.out.println("4. Buscar Curso");
            System.out.println("5. Modificar Curso");
            System.out.println("6. Volver al Menú Principal");

            try{
                System.out.println("\nIngrese una opción: ");
                opcion = scanner.nextInt();

                switch(opcion){
                   case 1:
                       break;
                   case 2:
                       ingresarCurso();
                       break;
                    case 3:
                       eliminarCurso();
                       break;
                    case 4:
                       
                       break;
                    case 5:
                       break;
                    case 6:
                       menuPrincipal();
                       break;
                    default:
                       System.out.println("Solo se permiten números entre 1 y 6");
                }
            }catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            }
        }
    }
    
    public void ingresarAlumno(){
        System.out.println("\n*************************************************");
        System.out.println("\n\tIngreso de datos del alumno\n");
        System.out.println("*************************************************");

        try{
            System.out.print("Ingrese el número de cédula: ");
            idAlumno = teclado.readLine();
            System.out.print("\nIngrese el nombre: ");
            nombreAlumno = teclado.readLine();
            System.out.print("\nIngrese el número de teléfono: ");
            telefonoAlumno = teclado.readLine();
            System.out.print("\nIngrese el correo electrónico: ");
            emailAlumno = teclado.readLine();
            System.out.print("\nIngrese la fecha de nacimiento en el formato DD/MM/AAAA: ");
            fechaNacimiento = teclado.readLine();
            System.out.print("\nIngrese el código de la carrera: ");
            carreraAlumno = teclado.readLine();
            usuarioAlumno = idAlumno;
        }catch (IOException ex) {
            System.out.print("Error al leer del teclado");
        } 
        
        System.out.println("\n*************************************************");
        System.out.println("\n\tDatos del alumno\n");
        System.out.println("*************************************************");
        System.out.println("Cédula: "+idAlumno);
        System.out.println("Nombre: "+nombreAlumno);
        System.out.println("Teléfono: "+telefonoAlumno);
        System.out.println("Email: "+emailAlumno);
        System.out.println("Fecha de Nacimiento: "+fechaNacimiento);
        System.out.println("Código Carrera: "+carreraAlumno);
        System.out.println("Usuario: "+idAlumno);
        
        alumno.setId_alumno(idAlumno);
        alumno.setNombre_alumno(nombreAlumno);
        alumno.setTelefono_alumno(telefonoAlumno);
        alumno.setEmail_alumno(emailAlumno);
        alumno.setFechaNacimiento(fechaNacimiento);
        alumno.setCarreras_cod_carr(carreraAlumno);
        alumno.setUsuarios_num_ced(usuarioAlumno);
        
        control.ingresarAlumno(alumno);
    }
    
    public void eliminarAlumno(){
        System.out.println("\n*************************************************");
        System.out.println("\n\tEliminar alumno\n");
        System.out.println("*************************************************");

        try{
            System.out.print("Ingrese el número de cédula del alumno: ");
            idAlumno = teclado.readLine();
        }catch (IOException ex) {
            System.out.print("Error al leer del teclado");
        } 
    }
    
    public void ingresarProfesor(){
        System.out.println("\n*************************************************");
        System.out.println("\n\tIngreso de datos del profesor\n");
        System.out.println("*************************************************");

        try{
            System.out.print("Ingrese el número de cédula: ");
            idProfesor = teclado.readLine();
            System.out.print("\nIngrese el nombre: ");
            nombreProfesor = teclado.readLine();
            System.out.print("\nIngrese el número de teléfono: ");
            telefonoProfesor = teclado.readLine();
            System.out.print("\nIngrese el correo electrónico: ");
            emailProfesor = teclado.readLine();
            usuarioProfesor = idProfesor;
        }catch (IOException ex) {
            System.out.print("Error al leer del teclado");
        } 
        
        System.out.println("\n*************************************************");
        System.out.println("\n\tDatos del profesor\n");
        System.out.println("*************************************************");
        System.out.println("Cédula: "+idProfesor);
        System.out.println("Nombre: "+nombreProfesor);
        System.out.println("Teléfono: "+telefonoProfesor);
        System.out.println("Email: "+emailProfesor);
        System.out.println("Usuario: "+idProfesor);
    }
    
    public void eliminarProfesor(){
        System.out.println("\n*************************************************");
        System.out.println("\n\tEliminar profesor\n");
        System.out.println("*************************************************");

        try{
            System.out.print("Ingrese el número de cédula del profesor: ");
            idProfesor = teclado.readLine();
        }catch (IOException ex) {
            System.out.print("Error al leer del teclado");
        } 
    }
    
    public void ingresarCarrera(){
        System.out.println("\n*************************************************");
        System.out.println("\n\tIngreso de datos de la carrera\n");
        System.out.println("*************************************************");

        try{
            System.out.print("Ingrese el código de la carrera: ");
            codigoCarrera = teclado.readLine();
            System.out.print("\nIngrese el nombre: ");
            nombreCarrera = teclado.readLine();
            System.out.print("\nIngrese el título: ");
            titulo = teclado.readLine();
        }catch (IOException ex) {
            System.out.print("Error al leer del teclado");
        } 
        
        System.out.println("\n*************************************************");
        System.out.println("\n\tDatos de la carrera\n");
        System.out.println("*************************************************");
        System.out.println("Código: "+codigoCarrera);
        System.out.println("Nombre: "+nombreCarrera);
        System.out.println("Título: "+titulo);
    }
    
    public void eliminarCarrera(){
        System.out.println("\n*************************************************");
        System.out.println("\n\tEliminar carrera\n");
        System.out.println("*************************************************");

        try{
            System.out.print("Ingrese el código de la carrera: ");
            codigoCarrera = teclado.readLine();
        }catch (IOException ex) {
            System.out.print("Error al leer del teclado");
        } 
    }
    
    public void ingresarCurso(){
        System.out.println("\n*************************************************");
        System.out.println("\n\tIngreso de datos del curso\n");
        System.out.println("*************************************************");

        try{
            System.out.print("Ingrese el código del curso: ");
            codigoCurso = teclado.readLine();
            System.out.print("\nIngrese el nombre: ");
            nombreCurso = teclado.readLine();
            System.out.print("\nIngrese el número de créditos: ");
            creditos = Integer.parseInt(teclado.readLine());
            System.out.print("\nIngrese la cantidad de horas semanales: ");
            horasSemanales = Integer.parseInt(teclado.readLine());
        }catch (IOException ex) {
            System.out.print("Error al leer del teclado");
        } 
        
        System.out.println("\n*************************************************");
        System.out.println("\n\tDatos del curso\n");
        System.out.println("*************************************************");
        System.out.println("Código: "+codigoCurso);
        System.out.println("Nombre: "+nombreCurso);
        System.out.println("Créditos: "+creditos);
        System.out.println("Horas semanales: "+horasSemanales);
    }
    
    public void eliminarCurso(){
        System.out.println("\n*************************************************");
        System.out.println("\n\tEliminar curso\n");
        System.out.println("*************************************************");

        try{
            System.out.print("Ingrese el código del curso: ");
            codigoCurso = teclado.readLine();
        }catch (IOException ex) {
            System.out.print("Error al leer del teclado");
        } 
    }
    
}//fin class
