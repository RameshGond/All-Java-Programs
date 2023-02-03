package com.xworkz.fw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fw.beans.BrainBean;
import com.xworkz.fw.beans.EarBean;
import com.xworkz.fw.beans.ElbowBean;
import com.xworkz.fw.beans.EyesBean;
import com.xworkz.fw.beans.FingersBean;
import com.xworkz.fw.beans.HairBean;
import com.xworkz.fw.beans.HandBean;
import com.xworkz.fw.beans.HeartBean;
import com.xworkz.fw.beans.IntenstineBean;
import com.xworkz.fw.beans.KidneyBean;
import com.xworkz.fw.beans.LegBean;
import com.xworkz.fw.beans.LiverBean;
import com.xworkz.fw.beans.LungsBean;
import com.xworkz.fw.beans.MouthBean;
import com.xworkz.fw.beans.NoseBean;
import com.xworkz.fw.beans.SkeletonBean;
import com.xworkz.fw.beans.SkinBean;
import com.xworkz.fw.beans.TeethBean;
import com.xworkz.fw.beans.ToesBean;
import com.xworkz.fw.beans.TongueBean;

public class BodyPartsBoot {

	public static void main(String[] args) {

		String xmlMetaInfoPath = "resources/Spring-resources.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(xmlMetaInfoPath);
		BrainBean refOfBrain = context.getBean(BrainBean.class);
		refOfBrain.storage();

		System.out.println("************************************************************************");

		HeartBean refOfHeart = context.getBean(HeartBean.class);
		refOfHeart.pumping();

		System.out.println("////////////////////////////////////////////////////////////////////////////");
		KidneyBean refOfKidney = context.getBean(KidneyBean.class);
		refOfKidney.purify();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		LungsBean refOfLungs = context.getBean(LungsBean.class);
		refOfLungs.breathing();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		TongueBean refOfTongue = context.getBean(TongueBean.class);
		refOfTongue.taste();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		IntenstineBean refOfIntenstine = context.getBean(IntenstineBean.class);
		refOfIntenstine.digest();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		LiverBean refOfLiver = context.getBean(LiverBean.class);
		refOfLiver.enzyme();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		SkinBean refOfSkin = context.getBean(SkinBean.class);
		refOfSkin.protect();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		LegBean refOfLeg = context.getBean(LegBean.class);
		refOfLeg.walking();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		HandBean refOfHand = context.getBean(HandBean.class);
		refOfHand.eat();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		NoseBean refOfNose = context.getBean(NoseBean.class);
		refOfNose.smell();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		MouthBean refOfMouth = context.getBean(MouthBean.class);
		refOfMouth.speak();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		EyesBean refOfEyes = context.getBean(EyesBean.class);
		refOfEyes.see();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		EarBean refOfEar = context.getBean(EarBean.class);
		refOfEar.listening();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		TeethBean refOfTeeth = context.getBean(TeethBean.class);
		refOfTeeth.cut();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		HairBean refOfHair = context.getBean(HairBean.class);
		refOfHair.protection();
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		FingersBean refOfFinger = context.getBean(FingersBean.class);
		refOfFinger.write();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		ElbowBean refOfElbow = context.getBean(ElbowBean.class);
		refOfElbow.movement();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		SkeletonBean refOfSkeleton = context.getBean(SkeletonBean.class);
		refOfSkeleton.support();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		ToesBean refOfToes = context.getBean(ToesBean.class);
		refOfToes.balance();

	}

}
