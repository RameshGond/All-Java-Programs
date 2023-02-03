package com.xworkz.person_info.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/using")
public class PersonInformationServlet extends HttpServlet {

	public PersonInformationServlet() {
		System.out.println("calling person info servlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doGet Method");
		
		String firstName=req.getParameter("firstName");
		String middleName=req.getParameter("middleName");
		String lastName=req.getParameter("lastName");
		String age=req.getParameter("age");
		String gender=req.getParameter("gender");
		String maritalStatus=req.getParameter("maritalStatus");
		String bloodGroup=req.getParameter("bloodGroup");
		String mobileNo=req.getParameter("mobileNo");
		String email=req.getParameter("email");
		String dream=req.getParameter("dream");
		String fatherName=req.getParameter("fatherName");
		String motherName=req.getParameter("motherName");
		String sisterName=req.getParameter("sisterName");
		String height=req.getParameter("height");
		String weight=req.getParameter("weight");
		String dob=req.getParameter("dob");
		String birthPlace=req.getParameter("birthPlace");
		String skinColor=req.getParameter("skinColor");
		String hairType=req.getParameter("hairType");
		String disability=req.getParameter("disability");
		String footsize=req.getParameter("footsize");
		String birthTime=req.getParameter("birthTime");
		String primarySchoolName=req.getParameter("primarySchoolName");
		String favouriteTeacherName=req.getParameter("favouriteTeacherName");
		String favouriteSubject=req.getParameter("favouriteSubject");
		String highSchoolName=req.getParameter("highSchoolName");
		String percentage=req.getParameter("percenteg");
		String yearOfPassing=req.getParameter("yearOfPassing");
		String diplomaCollegeName=req.getParameter("diplomaCollegeName");
		String diplomaPercentage=req.getParameter("diplomapercenteg");
		String diplomaYearOfPassing=req.getParameter("diplomayearOfPassing");
		String degreeCollegeName=req.getParameter("degreeCollegeName");
		String degreePercentage=req.getParameter("degreepercentage");
		String degreeYearOfPassing=req.getParameter("degreeyearOfPassing");
		String favouriteTeluguMovie=req.getParameter("favouriteTeluguMovie");
		String favouriteTeluguActor=req.getParameter("favouriteTeluguActor");
		String favouriteTeluguActress=req.getParameter("favouriteTeluguActress");
		String favouriteLecturerName=req.getParameter("favouriteLecturerName");
		String favouriteSports=req.getParameter("favouriteSports");
		String favouriteNumber=req.getParameter("favouriteNumber");
		String favouriteFood=req.getParameter("favouriteFood");
		String favouriteSongKannada=req.getParameter("favouriteSongKannada");
		String favouriteSongHindi=req.getParameter("favouriteSongHindi");
		String favouriteMovie=req.getParameter("favouriteMovie");
		String favouriteActor=req.getParameter("favouriteActor");
		String favouriteHeroine=req.getParameter("favouriteHeroine");
		String favouriteSingerKannada=req.getParameter("favouriteSingerKannada");
		String favouriteSingerHindi=req.getParameter("favouriteSingerHindi");
		String favouriteCricketer=req.getParameter("favouriteCricketer");
		String favouriteTeam=req.getParameter("favouriteTeam");
		String favouriteIPLTeam=req.getParameter("favouriteIPLTeam");
		String favouriteKabaddiPlayer=req.getParameter("favouriteKabaddiPlayer");
		String favouriteAthletics=req.getParameter("favouriteAthletics");
		String favouriteColor=req.getParameter("favouriteColor");
		String favouriteLanguage=req.getParameter("favouriteLanguage");
		String favouriteBook=req.getParameter("favouriteBook");
		String favouriteCity=req.getParameter("favouriteCity");
		String favouriteGod=req.getParameter("favouriteGod");
		String favouritePlace=req.getParameter("favouritePlace");
		String favouriteBike=req.getParameter("favouriteBike");
		String favouriteCar=req.getParameter("favouriteCar");
		String roleModel=req.getParameter("roleModel");
		String myStrength=req.getParameter("myStrength");
		String weakness=req.getParameter("weakness");
		String bestFrndName=req.getParameter("bestFrndName");
		String myGuruName=req.getParameter("myGuruName");
		String awardInUG=req.getParameter("awardInUG");
		String myDushmanFriendName=req.getParameter("myDushmanFriendName");
		String kabaddi=req.getParameter("kabaddi");
		String crushName=req.getParameter("crushName");
		String aadharNo=req.getParameter("aadharNo");
		String panNo=req.getParameter("panNo");
		String DLNo=req.getParameter("DLNo");
		String voterId=req.getParameter("voterId");
		String wardNo=req.getParameter("wardNo");
		String permnetAddress=req.getParameter("permnetAddress");
		String AreaName=req.getParameter("AreaName");
		String HouseNo=req.getParameter("HouseNo");
		String villege=req.getParameter("villege");
		String taluk=req.getParameter("taluk");
		String district=req.getParameter("district");
		String state=req.getParameter("state");
		String country=req.getParameter("country");
		String pincode=req.getParameter("pincode");
		String postoffice=req.getParameter("postoffice");
		String areaPoliceStation=req.getParameter("areaPoliceStation");
		String hobali=req.getParameter("hobali");
		String currentAddress=req.getParameter("currentAddress");
		String countryCode=req.getParameter("countryCode");
		String noOfFamilyMembers=req.getParameter("noOfFamilyMembers");
		String presentJob=req.getParameter("presentJob");
		String accommodationType=req.getParameter("accommodationType");
		String favouriteNationalParty=req.getParameter("favouriteNationalParty");
		String favouriteLeader=req.getParameter("favouriteLeader");
		String favouriteCountry=req.getParameter("favouriteCountry");

		System.out.println(firstName +" "+ middleName  +" "+ lastName +" "+ age +" "+ gender +" "+ maritalStatus +" "+ bloodGroup +" "+ mobileNo +" "+ email +" "+  dream 
				+" "+ fatherName +" "+ motherName +" "+ sisterName  +" "+ height +" "+ weight +" "+ dob + " "+ birthPlace +" "+ skinColor +" "+ hairType +" "+ disability +" "+ footsize +" "+ birthTime +" "+
				primarySchoolName +" "+  primarySchoolName +" "+favouriteTeacherName+" "+ favouriteSubject +" "+ highSchoolName +" "+ percentage +" "+ yearOfPassing +" "+ diplomaCollegeName +" "+ diplomaPercentage +" "+ diplomaYearOfPassing  +" "+
				degreeCollegeName+" "+degreePercentage +" "+ degreeYearOfPassing+" "+ favouriteTeluguMovie+" "+ favouriteTeluguActor+" "+ favouriteTeluguActress  +" "+ favouriteLecturerName +" "+ favouriteSports +" "+favouriteNumber  +" "+
				favouriteFood+" "+ favouriteSongKannada  +" "+ favouriteSongHindi   +" "+ favouriteMovie +" "+ favouriteActor+" "+ favouriteHeroine+" "+ favouriteSingerKannada+" "+ favouriteSingerHindi +" "+
				favouriteCricketer +" "+ favouriteTeam +" "+ favouriteIPLTeam +" "+ favouriteKabaddiPlayer+" "+favouriteAthletics+" "+ favouriteColor+" "+ favouriteLanguage +" "+favouriteBook+" "+ favouriteCity+" "+ favouriteGod+" "+ favouritePlace+" "+ favouriteBike+" "+
				favouriteCar+" "+ roleModel+" "+ myStrength +" "+ weakness + " "+ bestFrndName +" "+myGuruName +" "+ awardInUG+" "+ myDushmanFriendName+" "+
				kabaddi+" "+ crushName+" "+ aadharNo +" "+ panNo  +" "+DLNo +" "+ voterId+" "+ wardNo+" "+ permnetAddress+" "+ AreaName+" "+
				HouseNo +" "+ villege +" "+ taluk +" "+ district +" "+ state +" "+ country +" "+ pincode +" "+  postoffice+" "+
				areaPoliceStation +" "+ hobali +" "+ currentAddress  +" "+ countryCode +" "+ noOfFamilyMembers+" "+ presentJob+" "+ accommodationType+" "+ favouriteNationalParty+" "+
				favouriteLeader+" "+ favouriteCountry);
		super.doGet(req, resp);
	}

}
