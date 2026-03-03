package fr.afpa.employees;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
Objectif :
L’objectif de ce TP est de concevoir un programme en console basé sur une approche objet et
permettant de gérer (vraiment très basiquement) des salariés d’une entreprise.

Vous allez écrire une classe représentant les salariés d'une entreprise.
Vous pourrez vous aider du PDF disponible sur pour obtenir des informations sur la façon de faire.
*/

class Employee {
	/**
	 * Matricule de l'employé
	 */
	private String registrationNumber;
	private String lastName;
	private String firstName;
	private LocalDate birthDate;
	private double salary;
	private double salaryNet;
	private final int socialRate = 30;

	// TODO compléter les attributs comme présenté dans le PDF

	// TODO compléter le constructeur de la classe
	public Employee(String registrationNumber, String lastName, String firstName, LocalDate birthDate, LocalDate currentDate,
			double salary, double socialParticipation) {
		this.registrationNumber = registrationNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.salary = salary;
	}

	// TODO implémenter les setters et getters de la classe (permet d'accéder aux
	// attributs privés)
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) throws Exception {
		this.registrationNumber = registrationNumber;
	}

	// TODO ajouter les getters et les setters

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws Exception {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) throws Exception {
		this.firstName = firstName;
	}

	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(LocalDate birthDate) throws Exception {
		this.birthDate = birthDate;
	}

	public int getBirthTimeLeft() {
		LocalDate currentDate = LocalDate.now();

		// faire évoluer la ligner suivante

		int nextYear = currentDate.getYear();

		LocalDate nextBirthDate = LocalDate.of(nextYear , this.birthDate.getMonth(), this.birthDate.getDayOfMonth());
		
		long daysBetween = ChronoUnit.DAYS.between(currentDate, nextBirthDate);
	
		return (int)daysBetween;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws Exception {
		this.salary = salary;
	}

	public double getSalaryNet() {
		salaryNet = salary - salary * 30;
		return salary;
	}

	// TODO implémenter la méthode "toString()" qui renvoie une chaîne de caractère
	// qui représente un objet de la classe employé

	// plus d'information sur la méthode "toString()" ->
	// https://codegym.cc/fr/groups/posts/fr.986.mthode-java-tostring

	@Override
	public String toString() {
		return "Je m'appelle "
				+ "Nom " + this.lastName
				+ "Prénom  " + this.firstName
				+ "Date de naissance  " + this.birthDate
				+ " Jours restant avant anniversaire  " + this.getBirthTimeLeft()
				+ " Salaire Net " + this.salaryNet
				+ " Participation sociale " + this.socialRate;
	}
}
