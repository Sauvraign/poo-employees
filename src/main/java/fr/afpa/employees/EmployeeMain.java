package fr.afpa.employees;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Classe principale du projet, contient la fonction "main"
 */
class EmployeeMain
{
	public static void main(String[] args) 
	{
		System.out.println("\n----- Exercice de programmation objet - classe \"Employee\" -----");

		// TODO instanciez 4 objets de la classe "Employee" (une fois celle-ci implémentée)
		Employee employee1 = new Employee("11ABC22 ", "LABAT ", "Kevin ", LocalDate.parse("1992-11-28"), LocalDate.now(),10, 10);
		Employee employee2 = new Employee("11ABC22 ", "LABAT ", "Dylan ", LocalDate.parse("1992-11-28"), LocalDate.now(),10, 10);
		Employee employee3 = new Employee("11ABC22 ", "LABAT ", "Benoit ", LocalDate.parse("1992-11-28"), LocalDate.now(),10, 10);
		Employee employee4 = new Employee("11ABC22 ", "LABAT ", "Corinne ", LocalDate.parse("1992-11-28"), LocalDate.now(),10, 10);

		// TODO afficher les informations des employés avec System.out.println
		System.out.println(employee1.getFirstName() + employee1.getLastName());
		System.out.println(employee2.getFirstName() + employee2.getLastName());
		System.out.println(employee3.getFirstName() + employee3.getLastName());
		System.out.println(employee4.getFirstName() + employee4.getLastName());
	}
}

