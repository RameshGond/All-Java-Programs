package com.xworkz.resume;

import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

public class Resume {

	private static String FILE = "C:\\Users\\Happy\\Desktop\\JOB APPLICATIONS\\sanjay resume.pdf";

	private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD, BaseColor.BLACK);
	private static Font small = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK);
	private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD, BaseColor.BLACK);
	private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.BLACK);

	public static void main(String[] args) {
		try {
			Document document = new Document();

			PdfWriter.getInstance(document, new FileOutputStream(FILE));

			document.open();
			addMetaData(document);
			addTitlePage(document);
			addContent(document);
			document.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		} catch (DocumentException e) {
			e.printStackTrace();
			System.out.println(e);
		}

	}

	private static void addMetaData(Document document) {

		document.addTitle("saraswathi");
		document.addSubject("CV for Software Developer");
		document.addKeywords("JAVA, SQL, HTML, CSS, JS");
		document.addAuthor("Saraswathi TK");
		document.addCreator("Saru");
	}

	private static void addTitlePage(Document document) throws DocumentException {

		Paragraph preface8 = new Paragraph();

		preface8.add(new Paragraph("Saraswathi TK", catFont));

		preface8.add(new Paragraph("Mobile: 6362441978", smallBold));
		preface8.add(new Paragraph("Mail: saru251579@gmail.com", smallBold));
		addEmptyLine(preface8, 1);

		LineSeparator lsHeading = new LineSeparator();
		lsHeading.setPercentage(100);
		lsHeading.setLineWidth(2);

		Paragraph preface = new Paragraph();

		preface.add(new Paragraph("Experience:", subFont));
		preface.add(new Paragraph(
				"Pursuing Enterprise Application Development Training at X-workz ODC in Bangalore from Mar-2022 to Currently",
				smallBold));
		addEmptyLine(preface, 1);
		preface.add(new Paragraph("Technical Skills:", subFont));
		List list = new List(List.UNORDERED);

		/*
		 * Chunk head = new Chunk("Address", small); Chunk headexp = new Chunk("Tumkur",
		 * smallBold);
		 * 
		 * Phrase phr = new Phrase(); phr.add(head); phr.add(headexp);
		 * 
		 * list.add(phr);
		 */

		list.add(new ListItem("Programming Languages: Java, SQL", smallBold));
		list.add(new ListItem("API - JDBC", smallBold));
		list.add(new ListItem("Build Tool - Lombok, GIT, Apache POI", smallBold));
		list.add(new ListItem("Frameworks - Spring Framework", smallBold));
		list.add(new ListItem("DB - MySQL", smallBold));
		list.add(new ListItem("Web Technologies - HTML, JavaScript, CSS", smallBold));
		list.add(new ListItem("Tools - Eclipse, Visual Studio, MS office", smallBold));
		list.add(new ListItem("OS - windows", smallBold));

		document.add(preface8);
		document.add(lsHeading);
		document.add(preface);
		document.add(list);

		Paragraph preface1 = new Paragraph();

		addEmptyLine(preface1, 1);
		preface1.add(new Paragraph("Technical Summary:", subFont));
		addEmptyLine(preface1, (1 / 4));
		preface1.add(new Paragraph("1. Java:", subFont));
		List list1 = new List(List.UNORDERED);
		list1.setListSymbol("•  ");
		list1.add(new ListItem("Classes, datatypes, variables and Objects.", smallBold));
		list1.add(new ListItem("Conditional statements and control statements.", smallBold));
		list1.add(new ListItem("Knowledge about Methods and Constructors.", smallBold));
		list1.add(new ListItem(
				"Knowledge on OOPS concepts i.e. Abstraction, Inheritance, Polymorphism and Encapsulation.",
				smallBold));
		list1.add(new ListItem("Knowledge of the usage of packages and access modifier.", smallBold));
		list1.add(new ListItem("Good understanding of arrays and usage of arrays.", smallBold));
		list1.add(new ListItem(
				"Good knowledge of exceptions and handling of exceptions and also know to create custom exceptions.",
				smallBold));
		list1.add(new ListItem("Knowledge about wrapper classes and type casting.", smallBold));
		list1.add(new ListItem("Knowledge of interfaces and abstract classes.", smallBold));
		list1.add(new ListItem("Good understanding of anonymous classes, functional interfaces and lambda expressions.",
				smallBold));
		list1.add(new ListItem("Design patterns of industry standards i.e. DTO, DAO, Service etc", smallBold));
		list1.add(new ListItem("Knowledge on Collection Framework.", smallBold));
		list1.add(new ListItem("Knowledge on map.", smallBold));
		list1.add(new ListItem("Knowledge of servlets.", smallBold));

		document.add(preface1);
		document.add(list1);

		Paragraph preface2 = new Paragraph();
		addEmptyLine(preface2, 1);

		preface2.add(new Paragraph("2. SQL:", subFont));
		List list2 = new List(List.UNORDERED);
		list2.setListSymbol("•  ");
		list2.add(new ListItem("Knowledge of Database & Table creation with CRUD operations.", smallBold));
		list2.add(new ListItem("Filtering, Sorting, Predicates and working examples.", smallBold));
		list2.add(new ListItem("Knowledge of DDL, DML, DCL, TCL, DQL command statements.", smallBold));
		list2.add(new ListItem("Knowledge on Joints, Sub-query.", smallBold));

		document.add(preface2);
		document.add(list2);

		Chunk c1 = new Chunk("Address", small);
		Chunk c2 = new Chunk("Chikkamagalore Karnataka", smallBold);

		Phrase ph = new Phrase();
		ph.add(c1);
		ph.add(c2);

		// list3.add(ph);
		// Start a new page
		document.newPage();
		System.out.println("Resume Generated");

	}

	private static void addContent(Document document) throws DocumentException {
		Paragraph preface3 = new Paragraph();

		preface3.add(new Paragraph("3. JDBC:", subFont));
		List list3 = new List(List.UNORDERED);
		list3.setListSymbol("•  ");
		list3.add(new ListItem("Description about Driver and its types", smallBold));
		list3.add(new ListItem("Steps for JDBC", smallBold));
		list3.add(new ListItem("Types of statement - Statement, Prepared Statement, Callable statement", smallBold));
		list3.add(new ListItem("Description about Result set", smallBold));
		list3.add(new ListItem("CRUD operations using different types of statements.", smallBold));

		document.add(preface3);
		document.add(list3);

		Paragraph preface4 = new Paragraph();
		addEmptyLine(preface4, 1);
		preface4.add(new Paragraph("4. Web Technologies:", subFont));
		List list4 = new List(List.UNORDERED);
		list4.setListSymbol("•  ");
		list4.add(new ListItem("HTML Tags.", smallBold));
		list4.add(new ListItem("Form Creation & Table Creation.", smallBold));
		list4.add(new ListItem(
				"Java Script - Introduction, datatypes, variables, conditional statement, validation of forms.",
				smallBold));
		list4.add(new ListItem("CSS - CSS Selectors, types of CSS.", smallBold));
		list4.add(new ListItem("Padding, border, text decoration properties.", smallBold));
		list4.add(new ListItem("Webpage design including linking of Java Script & CSS Stylesheet.", smallBold));

		document.add(preface4);
		document.add(list4);

		Paragraph preface5 = new Paragraph();
		addEmptyLine(preface5, 1);
		preface5.add(new Paragraph("5. Spring Framework:", subFont));
		List list5 = new List(List.UNORDERED);
		list5.setListSymbol("•  ");
		list5.add(new ListItem("Dependency injection & Inversion of control.", smallBold));
		list5.add(new ListItem("XML based configuration & Java Annotation based configuration", smallBold));
		list5.add(new ListItem("Application Context.", smallBold));
		list5.add(new ListItem("Beans Association using XML & Annotation also", smallBold));

		document.add(preface5);
		document.add(list5);

		Paragraph preface6 = new Paragraph();
		addEmptyLine(preface6, 1);
		preface6.add(new Paragraph("6. Web Applications:", subFont));
		List list6 = new List(List.UNORDERED);
		list6.setListSymbol("•  ");
		list6.add(new ListItem("Web Applications Integration with server.", smallBold));
		list6.add(new ListItem("Types of Servers", smallBold));
		list6.add(new ListItem("Engines of Browser.", smallBold));
		list6.add(new ListItem("Types of Resources.", smallBold));
		list6.add(new ListItem("Tomcat Server Startup & Shutdown", smallBold));

		document.add(preface6);
		document.add(list6);

		Paragraph preface7 = new Paragraph();
		addEmptyLine(preface7, 1);
		preface7.add(new Paragraph("Educational Qualification:", subFont));
		List list7 = new List(List.UNORDERED);
		list7.setListSymbol("•  ");
		list7.add(new ListItem("Completed Bachelor of Computer Application in 2021 with 73.67% Result.", smallBold));
		list7.add(new ListItem("Department of Pre-University in 2018 with 53.16% Result.", smallBold));
		list7.add(
				new ListItem("Karnataka Secondary Education Examination Bord in 2015 with 66.88% Result.", smallBold));
		document.add(preface7);
		document.add(list7);

	}

	private static void addEmptyLine(Paragraph paragraph, int number) {

		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph(" "));
		}
	}

}
