package com.xworkz.mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.xworkz.mapinterface.dto.AddressDTO;
import com.xworkz.mapinterface.dto.PersonDTO;

public class PersonsDetailsRunner {

	public static void main(String[] args) {
		PersonDTO dto1 = new PersonDTO(1, "Ram", "ram@gmail.com", 8050319200L);
		PersonDTO dto2 = new PersonDTO(2, "Shyam", "shyam@gmail.com", 7756120099L);
		PersonDTO dto3 = new PersonDTO(3, "Gyan", "gyan@gmail.com", 8714556588L);
		PersonDTO dto4 = new PersonDTO(4, "Santosh", "santosh@gmail.com", 7644109811L);
		PersonDTO dto5 = new PersonDTO(5, "Sweta", "sweta@gmail.com", 9764932188L);
		PersonDTO dto6 = new PersonDTO(6, "Chandna", "chandna@gmail.com", 7828864199L);
		PersonDTO dto7 = new PersonDTO(7, "raghu", "raghu@gmail.com", 7859932466L);
		PersonDTO dto8 = new PersonDTO(8, "ritam", "ritam@gmail.com", 627489983L);
		PersonDTO dto9 = new PersonDTO(9, "Rupak", "rupak@gmail.com", 8700234555L);
		PersonDTO dto10 = new PersonDTO(10, "Sapna", "sapna@gmail.com", 7684091217L);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		PersonDTO dto11 = new PersonDTO(11, "Sanjay", "sanjaym@gmail.com", 8011345644L);
		PersonDTO dto12 = new PersonDTO(12, "Neelappa", "neelappa@gmail.com", 7689453233L);
		PersonDTO dto13 = new PersonDTO(13, "Nagaratna", "naagratna@gmail.com", 7890453277L);
		PersonDTO dto14 = new PersonDTO(14, "Pushpa", "pushpan@gmail.com", 7689210088L);
		PersonDTO dto15 = new PersonDTO(15, "Manoj", "manojn@gmail.com", 89888120144L);
		PersonDTO dto16 = new PersonDTO(16, "Meghna", "meghnasanju@gmail.com", 7680921222L);
		PersonDTO dto17 = new PersonDTO(17, "Abhi", "abhi@gmail.com", 8790345177L);
		PersonDTO dto18 = new PersonDTO(18, "jeevan", "jee@gmail.com", 62709234599L);
		PersonDTO dto19 = new PersonDTO(19, "Pavan", "pavan@gmail.com", 9980764427L);
		PersonDTO dto20 = new PersonDTO(20, "Brinda", "brinda@gmail.com", 8690026453L);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		PersonDTO dto21 = new PersonDTO(21, "Laxmi", "laxmi@gmail.com", 8790954210L);
		PersonDTO dto22 = new PersonDTO(22, "Mallappa", "mallappa@gmail.com", 7689502111L);
		PersonDTO dto23 = new PersonDTO(23, "Rajsheckar", "raju@gmail.com", 7689045355L);
		PersonDTO dto24 = new PersonDTO(24, "Rajeshwari", "raji@gmail.com", 76809453266L);
		PersonDTO dto25 = new PersonDTO(25, "Sinchana", "sinch@gmail.com", 87907662255L);
		PersonDTO dto26 = new PersonDTO(26, "Lalita", "lalita@gmail.com", 9808775648L);
		PersonDTO dto27 = new PersonDTO(27, "Satwik", "satiwik@gmail.com", 8909742133L);
		PersonDTO dto28 = new PersonDTO(28, "Shravani", "shravani@gmail.com", 9808675177L);
		PersonDTO dto29 = new PersonDTO(29, "Mayura", "mayura@gamil.com", 8797555100L);
		PersonDTO dto30 = new PersonDTO(30, "Prashant", "prassant@gmail.com", 9807711235L);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		PersonDTO dto31 = new PersonDTO(31, "Shivkumar", "shiv@gmail.com", 980981277L);
		PersonDTO dto32 = new PersonDTO(32, "Sanjana", "sanjuu@gmail.com", 768900563L);
		PersonDTO dto33 = new PersonDTO(33, "chandrashecker", "chandshekar@gmail.com", 98901432L);
		PersonDTO dto34 = new PersonDTO(34, "Seema", "seema@gamil.com", 89707654L);
		PersonDTO dto35 = new PersonDTO(35, "Raj", "raj@gamil.com", 90871234L);
		PersonDTO dto36 = new PersonDTO(36, "Reema", "reem@gamil", 87901234L);
		PersonDTO dto37 = new PersonDTO(37, "Anushaa", "anushaa@gmail.com", 880977654L);
		PersonDTO dto38 = new PersonDTO(38, "Raniki", "raniki@gami.com", 890786754L);
		PersonDTO dto39 = new PersonDTO(39, "Shaan", "shaan@gamil.com", 980912345L);
		PersonDTO dto40 = new PersonDTO(40, "Shekhar", "shekhar@gmail.com", 77907564L);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		PersonDTO dto41 = new PersonDTO(41, "Shweta", "shweta@gmail.com", 878849321L);
		PersonDTO dto42 = new PersonDTO(42, "Nitin", "nitin@gmail.com", 797214566L);
		PersonDTO dto43 = new PersonDTO(43, "Savita", "savita@gmail.com", 89764231L);
		PersonDTO dto44 = new PersonDTO(44, "Bipin", "bipin@gmail.com", 98120989L);
		PersonDTO dto45 = new PersonDTO(45, "Shankar", "shankar@gmail.com", 897612075L);
		PersonDTO dto46 = new PersonDTO(46, "Pramila", "pramila@gmail.com", 98071234L);
		PersonDTO dto47 = new PersonDTO(47, "Yashshvi", "yashshvi@gmail.com", 879875423L);
		PersonDTO dto48 = new PersonDTO(48, "Shriyash", "shriyash@gmail.com", 988765109L);
		PersonDTO dto49 = new PersonDTO(49, "Nividita", "nivi@gmail.com", 909887123L);
		PersonDTO dto50 = new PersonDTO(50, "Lucky", "lucky@gmail.com", 989076543L);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		PersonDTO dto51 = new PersonDTO(51, "Rajsheekhar", "rajs@gmail.com", 909875132l);
		PersonDTO dto52 = new PersonDTO(52, "Rajii", "rajii@gmail.com", 908914528l);
		PersonDTO dto53 = new PersonDTO(53, "Shamiksha", "shamii@gmail.com", 908761256l);
		PersonDTO dto54 = new PersonDTO(54, "Anand", "anad@gmail.com", 90871108l);
		PersonDTO dto55 = new PersonDTO(55, "Bhumi", "bhumi@gmail.com", 908712667l);
		PersonDTO dto56 = new PersonDTO(56, "Sainil", "sai@gmail.com", 937029671l);
		PersonDTO dto57 = new PersonDTO(57, "Pranay", "pranay@gmail.com", 90761145l);
		PersonDTO dto58 = new PersonDTO(58, "Diksha", "diksha@gmail.com", 98712349l);
		PersonDTO dto59 = new PersonDTO(59, "Prema", "prema@gmail.com", 90875110l);
		PersonDTO dto60 = new PersonDTO(60, "Arun", "arun@gmail.com", 90807655l);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		PersonDTO dto61 = new PersonDTO(61, "Meghana B M", "meghanabmp@gmail.com", 987654311L);
		PersonDTO dto62 = new PersonDTO(62, "Priyanka B M", "priyanka@gmail.com", 987654312L);
		PersonDTO dto63 = new PersonDTO(63, "Pavithra B M", "pavi@gmail.com", 987654313L);
		PersonDTO dto64 = new PersonDTO(64, "Prajwal B M", "prajwal@gmail.com", 987654314L);
		PersonDTO dto65 = new PersonDTO(65, "Meenakshi", "menakshi@gmail.com", 987654315L);
		PersonDTO dto66 = new PersonDTO(66, "Manjunath", "manjunath@gmail.com", 987654316L);
		PersonDTO dto67 = new PersonDTO(67, "Suresh", "suresh@gmail.com", 987654317L);
		PersonDTO dto68 = new PersonDTO(68, "Geetha", "geetha@gmail.com", 987654318L);
		PersonDTO dto69 = new PersonDTO(69, "Jeevan", "jeevan@gmail.com", 987654319L);
		PersonDTO dto70 = new PersonDTO(70, "Paavan KS", "pavan@gmail.com", 987654320L);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		PersonDTO dto71 = new PersonDTO(71, "Ravi", "ravi@gmail.com", 987654321L);
		PersonDTO dto72 = new PersonDTO(72, "Giri", "giri@gmail.com", 987654322L);
		PersonDTO dto73 = new PersonDTO(73, "Preethi", "preethi@gmail.com", 987654323L);
		PersonDTO dto74 = new PersonDTO(74, "PavanKumar", "pavankumar@gmail.com", 987654324L);
		PersonDTO dto75 = new PersonDTO(75, "Shivaraj", "shivaraj@gmail.com", 987654325L);
		PersonDTO dto76 = new PersonDTO(76, "Manjunath", "manjunath@gmail.com", 987654326L);
		PersonDTO dto77 = new PersonDTO(77, "Sudha", "sudha@gmail.com", 987654327L);
		PersonDTO dto78 = new PersonDTO(78, "Sathvika", "sathvika@gmail.com", 987654328L);
		PersonDTO dto79 = new PersonDTO(79, "Chintu", "chintu@gmail.com", 987654329L);
		PersonDTO dto80 = new PersonDTO(80, "Chinnu", "chinnu@gmail.com", 987654330L);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		PersonDTO dto81 = new PersonDTO(81, "Ramesh", "ramesh@gmail.com", 9876543319L);
		PersonDTO dto82 = new PersonDTO(82, "Renuka", "renuka@gmail.com", 9876543327L);
		PersonDTO dto83 = new PersonDTO(83, "Sandeep B", "sandeep@gmail.com", 9876543333L);
		PersonDTO dto84 = new PersonDTO(84, "Uday", "uday@gmail.com", 9876543340L);
		PersonDTO dto85 = new PersonDTO(85, "Sathish", "sathish@gmail.com", 9876543357L);
		PersonDTO dto86 = new PersonDTO(86, "Apeksha", "appi@gmail.com", 9876543369L);
		PersonDTO dto87 = new PersonDTO(87, "Sindhu", "sindhu@gmail.com", 9876543373L);

		AddressDTO address1 = new AddressDTO(1, "Yellow Water Tank", 101, "Bengaluru");
		AddressDTO address2 = new AddressDTO(2, "Yellow Water Tank", 101, "Bengaluru");
		AddressDTO address3 = new AddressDTO(3, "Yellow Water Tank", 101, "Bengaluru");
		AddressDTO address4 = new AddressDTO(4, "Yellow Water Tank", 101, "Bengaluru");
		AddressDTO address5 = new AddressDTO(5, "Yellow Water Tank", 101, "Bengaluru");
		AddressDTO address6 = new AddressDTO(6, "Yellow Water Tank", 101, "Bengaluru");
		AddressDTO address7 = new AddressDTO(7, "Yellow Water Tank", 101, "Bengaluru");
		AddressDTO address8 = new AddressDTO(8, "Yellow Water Tank", 101, "Bengaluru");
		AddressDTO address9 = new AddressDTO(9, "Yellow Water Tank", 101, "Bengaluru");
		AddressDTO address10 = new AddressDTO(10, "Yellow Water Tank", 101, "Bengaluru");

		AddressDTO address11 = new AddressDTO(11, "J J Chauck", 404, "Gunupur");
		AddressDTO address12 = new AddressDTO(12, "J J Chauck", 404, "Gunupur");
		AddressDTO address13 = new AddressDTO(13, "J J Chauck", 404, "Gunupur");
		AddressDTO address14 = new AddressDTO(14, "J J Chauck", 404, "Gunupur");
		AddressDTO address15 = new AddressDTO(15, "J J Chauck", 404, "Gunupur");
		AddressDTO address16 = new AddressDTO(16, "J J Chauck", 404, "Gunupur");
		AddressDTO address17 = new AddressDTO(17, "J J Chauck", 404, "Gunupur");
		AddressDTO address18 = new AddressDTO(18, "J J Chauck", 404, "Gunupur");
		AddressDTO address19 = new AddressDTO(19, "J J Chauck", 404, "Gunupur");
		AddressDTO address20 = new AddressDTO(20, "J J Chauck", 404, "Gunupur");

		AddressDTO address21 = new AddressDTO(21, "Mahantesh Nagar", 201, "Ramdurg");
		AddressDTO address22 = new AddressDTO(22, "Mahantesh Nagar", 201, "Ramdurg");
		AddressDTO address23 = new AddressDTO(23, "Mahantesh Nagar", 201, "Ramdurg");
		AddressDTO address24 = new AddressDTO(24, "Mahantesh Nagar", 201, "Ramdurg");
		AddressDTO address25 = new AddressDTO(25, "Mahantesh Nagar", 201, "Ramdurg");
		AddressDTO address26 = new AddressDTO(26, "Mahantesh Nagar", 201, "Ramdurg");
		AddressDTO address27 = new AddressDTO(27, "Mahantesh Nagar", 201, "Ramdurg");
		AddressDTO address28 = new AddressDTO(28, "Mahantesh Nagar", 201, "Ramdurg");
		AddressDTO address29 = new AddressDTO(29, "Mahantesh Nagar", 201, "Ramdurg");
		AddressDTO address30 = new AddressDTO(30, "Mahantesh Nagar", 201, "Ramdurg");

		AddressDTO address31 = new AddressDTO(31, "Saksohara", 777, "Bind");
		AddressDTO address32 = new AddressDTO(32, "Saksohara", 777, "Bind");
		AddressDTO address33 = new AddressDTO(33, "Saksohara", 777, "Bind");
		AddressDTO address34 = new AddressDTO(34, "Saksohara", 777, "Bind");
		AddressDTO address35 = new AddressDTO(35, "Saksohara", 777, "Bind");
		AddressDTO address36 = new AddressDTO(36, "Saksohara", 777, "Bind");
		AddressDTO address37 = new AddressDTO(37, "Saksohara", 777, "Bind");
		AddressDTO address38 = new AddressDTO(38, "Saksohara", 777, "Bind");
		AddressDTO address39 = new AddressDTO(39, "Saksohara", 777, "Bind");
		AddressDTO address40 = new AddressDTO(40, "Saksohara", 777, "Bind");

		AddressDTO address41 = new AddressDTO(41, "Begampur", 101, "Patnacity");
		AddressDTO address42 = new AddressDTO(42, "Begampur", 101, "Patnacity");
		AddressDTO address43 = new AddressDTO(43, "Begampur", 101, "Patnacity");
		AddressDTO address44 = new AddressDTO(44, "Begampur", 101, "Patnacity");
		AddressDTO address45 = new AddressDTO(45, "Begampur", 101, "Patnacity");
		AddressDTO address46 = new AddressDTO(46, "Begampur", 101, "Patnacity");
		AddressDTO address47 = new AddressDTO(47, "Begampur", 101, "Patnacity");
		AddressDTO address48 = new AddressDTO(48, "Begampur", 101, "Patnacity");
		AddressDTO address49 = new AddressDTO(49, "Begampur", 101, "Patnacity");
		AddressDTO address50 = new AddressDTO(50, "Begampur", 101, "Patnacity");

		AddressDTO address51 = new AddressDTO(51, "Phulwarisharif", 555, "Patna");
		AddressDTO address52 = new AddressDTO(52, "Phulwarisharif", 555, "Patna");
		AddressDTO address53 = new AddressDTO(53, "Phulwarisharif", 555, "Patna");
		AddressDTO address54 = new AddressDTO(54, "Phulwarisharif", 555, "Patna");
		AddressDTO address55 = new AddressDTO(55, "Phulwarisharif", 555, "Patna");
		AddressDTO address56 = new AddressDTO(56, "Phulwarisharif", 555, "Patna");
		AddressDTO address57 = new AddressDTO(57, "Phulwarisharif", 555, "Patna");
		AddressDTO address58 = new AddressDTO(58, "Phulwarisharif", 555, "Patna");
		AddressDTO address59 = new AddressDTO(59, "Phulwarisharif", 555, "Patna");
		AddressDTO address60 = new AddressDTO(60, "Phulwarisharif", 555, "Patna");

		AddressDTO address61 = new AddressDTO(61, "BTM", 99, "Bangalore");
		AddressDTO address62 = new AddressDTO(62, "BTM", 99, "Bangalore");
		AddressDTO address63 = new AddressDTO(63, "BTM", 99, "Bangalore");
		AddressDTO address64 = new AddressDTO(64, "BTM", 99, "Bangalore");
		AddressDTO address65 = new AddressDTO(65, "BTM", 99, "Bangalore");
		AddressDTO address66 = new AddressDTO(66, "BTM", 99, "Bangalore");
		AddressDTO address67 = new AddressDTO(67, "BTM", 99, "Bangalore");
		AddressDTO address68 = new AddressDTO(68, "BTM", 99, "Bangalore");
		AddressDTO address69 = new AddressDTO(69, "BTM", 99, "Bangalore");
		AddressDTO address70 = new AddressDTO(70, "BTM", 99, "Bangalore");

		AddressDTO address71 = new AddressDTO(71, "90 Feet", 901, "Danapur");
		AddressDTO address72 = new AddressDTO(72, "90 Feet", 901, "Danapur");
		AddressDTO address73 = new AddressDTO(73, "90 Feet", 901, "Danapur");
		AddressDTO address74 = new AddressDTO(74, "90 Feet", 901, "Danapur");
		AddressDTO address75 = new AddressDTO(75, "90 Feet", 901, "Danapur");
		AddressDTO address76 = new AddressDTO(76, "90 Feet", 901, "Danapur");
		AddressDTO address77 = new AddressDTO(77, "90 Feet", 901, "Danapur");
		AddressDTO address78 = new AddressDTO(78, "90 Feet", 901, "Danapur");
		AddressDTO address79 = new AddressDTO(79, "90 Feet", 901, "Danapur");
		AddressDTO address80 = new AddressDTO(80, "90 Feet", 901, "Danapur");

		AddressDTO address81 = new AddressDTO(81, "RamKrishna Nagar", 001, "Patna");
		AddressDTO address82 = new AddressDTO(82, "RamKrishna Nagar", 001, "Patna");
		AddressDTO address83 = new AddressDTO(83, "RamKrishna Nagar", 001, "Patna");
		AddressDTO address84 = new AddressDTO(84, "RamKrishna Nagar", 001, "Patna");
		AddressDTO address85 = new AddressDTO(85, "RamKrishna Nagar", 001, "Patna");
		AddressDTO address86 = new AddressDTO(86, "RamKrishna Nagar", 001, "Patna");
		AddressDTO address87 = new AddressDTO(87, "RamKrishna Nagar", 001, "Patna");

		Map<PersonDTO, AddressDTO> map = new HashMap<PersonDTO, AddressDTO>();

		map.put(dto1, address1);
		map.put(dto2, address2);
		map.put(dto3, address3);
		map.put(dto4, address4);
		map.put(dto5, address5);
		map.put(dto6, address6);
		map.put(dto7, address7);
		map.put(dto8, address8);
		map.put(dto9, address9);
		map.put(dto10, address10);
		map.put(dto11, address11);
		map.put(dto12, address12);
		map.put(dto13, address13);
		map.put(dto14, address14);
		map.put(dto15, address15);
		map.put(dto16, address16);
		map.put(dto17, address17);
		map.put(dto18, address18);
		map.put(dto19, address19);
		map.put(dto20, address20);
		map.put(dto21, address21);
		map.put(dto22, address22);
		map.put(dto23, address23);
		map.put(dto24, address24);
		map.put(dto25, address25);
		map.put(dto26, address26);
		map.put(dto27, address27);
		map.put(dto28, address28);
		map.put(dto29, address29);
		map.put(dto30, address30);
		map.put(dto31, address31);
		map.put(dto32, address32);
		map.put(dto33, address33);
		map.put(dto34, address34);
		map.put(dto35, address35);
		map.put(dto36, address36);
		map.put(dto37, address37);
		map.put(dto38, address38);
		map.put(dto39, address39);
		map.put(dto40, address40);
		map.put(dto41, address41);
		map.put(dto42, address42);
		map.put(dto43, address43);
		map.put(dto44, address44);
		map.put(dto45, address45);
		map.put(dto46, address46);
		map.put(dto47, address47);
		map.put(dto48, address48);
		map.put(dto49, address49);
		map.put(dto50, address50);
		map.put(dto51, address51);
		map.put(dto52, address52);
		map.put(dto53, address53);
		map.put(dto54, address54);
		map.put(dto55, address55);
		map.put(dto56, address56);
		map.put(dto57, address57);
		map.put(dto58, address58);
		map.put(dto59, address59);
		map.put(dto60, address60);
		map.put(dto61, address61);
		map.put(dto62, address62);
		map.put(dto63, address63);
		map.put(dto64, address64);
		map.put(dto65, address65);
		map.put(dto66, address66);
		map.put(dto67, address67);
		map.put(dto68, address68);
		map.put(dto69, address69);
		map.put(dto70, address70);
		map.put(dto71, address71);
		map.put(dto72, address72);
		map.put(dto73, address73);
		map.put(dto74, address74);
		map.put(dto75, address75);
		map.put(dto76, address76);
		map.put(dto77, address77);
		map.put(dto78, address78);
		map.put(dto79, address79);
		map.put(dto80, address80);
		map.put(dto81, address81);
		map.put(dto82, address82);
		map.put(dto83, address83);
		map.put(dto84, address84);
		map.put(dto85, address85);
		map.put(dto86, address86);
		map.put(dto87, address87);

		Set<PersonDTO> person = map.keySet();
		person.stream().sorted().forEach(System.out::println);

		// Collection<AddressDTO> address = map.values();
		// address.stream().sorted().forEach(System.out::println);

		System.out.println("find by address");
		map.entrySet().stream().sorted((e1, e2) -> {
			AddressDTO addressDTO1 = e1.getValue();
			AddressDTO addressDTO2 = e2.getValue();
			return addressDTO2.getId().compareTo(addressDTO1.getId());
		}).forEach(entry -> {
			PersonDTO PersonDTO = entry.getKey();
			AddressDTO addressDTO = entry.getValue();
			System.out.println(PersonDTO.getName() + " " + addressDTO.getId());
		});

		System.out.println("address in ascending order");

		map.entrySet().stream().sorted((p, a) -> {
			AddressDTO addressDTO = a.getValue();
			AddressDTO addressDTO1 = a.getValue();
			return addressDTO.getId().compareTo(addressDTO1.getId());
		}).forEach(entry -> {
			PersonDTO personDTO = entry.getKey();
			AddressDTO addressDTO = entry.getValue();
			System.out.println(personDTO.getName() + "   " + addressDTO.getId());
		});

		System.out.println("find persondto by name and email\n");

		map.entrySet().stream().filter(entry -> {
			PersonDTO personDTO = entry.getKey();
			if (personDTO.getName().equalsIgnoreCase("Priyanka B M")
					&& personDTO.getEmail().equalsIgnoreCase("priyanka@gmail.com")) {
				return true;
			}
			return false;
		}).forEach(entry -> {
			PersonDTO personDTO = entry.getKey();
			AddressDTO addressDTO = entry.getValue();
			System.out.println(personDTO);
		});

		System.out.println("find all addressDTO by street and doorNo\n");

		map.entrySet().stream().filter(entry -> {
			AddressDTO addressDTO = entry.getValue();
			if (addressDTO.getStreet().equalsIgnoreCase("RamKrishna Nagar") && addressDTO.getDoorNo().equals(001)) {
				return true;
			}
			return false;
		}).forEach(entry -> {
			PersonDTO personDTO = entry.getKey();
			AddressDTO addressDTO = entry.getValue();
			System.out.println(addressDTO);
		});
	}

}
