package ejemplo05beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");
		MorcillaDeLeon morcilla = (MorcillaDeLeon) applicationContext.getBean("morcillaDeLeon");
		System.out.println(morcilla);
		morcilla.setColor("Esta que te mueres!");
		morcilla.setSabor("esta es de Villada");
 //Para probar que morcilla (que se declara en el bean) es singlenton, por lo que solo puede haber una instancia de el en cada maquina virtual
		MorcillaDeLeon otraMorcilla = (MorcillaDeLeon) applicationContext.getBean("morcillaDeLeon");
		System.out.println(morcilla);
		System.out.println(otraMorcilla);
	}

}
