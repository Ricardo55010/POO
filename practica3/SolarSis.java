import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.image.TextureLoader;
import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;
import javax.vecmath.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class SolarSis {	
	TextureLoader tex;
	public SolarSis(){	 
		BranchGroup group = new BranchGroup();
		Appearance appsol = new Appearance();
		Appearance appearth = new Appearance();
		Appearance appjupiter = new Appearance();
		Appearance appsaturn = new Appearance();
	    tex=new TextureLoader("TIERRA.JPG", null);
		appearth.setTexture(tex.getTexture());
		tex=new TextureLoader("SOL.JPG", null);
		appsol.setTexture(tex.getTexture());
		tex = new TextureLoader("JUPITER.JPG",null);
		appjupiter.setTexture(tex.getTexture());
		tex = new TextureLoader("SATURNO.JPG",null);
		appsaturn.setTexture(tex.getTexture());
		Sphere earth = new Sphere(0.045f, Primitive.GENERATE_NORMALS | Primitive.GENERATE_TEXTURE_COORDS, 32, appearth);
		Sphere sol = new Sphere(0.35f, Primitive.GENERATE_NORMALS | Primitive.GENERATE_TEXTURE_COORDS, 32, appsol);
		Sphere saturn = new Sphere(0.10f, Primitive.GENERATE_NORMALS | Primitive.GENERATE_TEXTURE_COORDS, 32, appsaturn);		
		Sphere jupiter = new Sphere(0.22f, Primitive.GENERATE_NORMALS | Primitive.GENERATE_TEXTURE_COORDS, 32, appjupiter);		

		TransformGroup earthRotXformGroup = Posi.rotate(earth, new Alpha(-1, 1250));
		TransformGroup jupiterRotXformGroup = Posi.rotate(jupiter, new Alpha(-1, 1250));
		TransformGroup saturnRotXformGroup = Posi.rotate(saturn, new Alpha(-1, 1250));
		TransformGroup solRotXformGroup = Posi.rotate(sol, new Alpha(-1, 1250));
		TransformGroup earthTransXformGroup = Posi.translate(earthRotXformGroup, new Vector3f(0.0f, 0.0f, 0.7f));
		TransformGroup jupiterTransXformGroup = Posi.translate(jupiterRotXformGroup, new Vector3f(0.0f, 0.0f, 1.27f));
		TransformGroup saturnTransXformGroup = Posi.translate(saturnRotXformGroup, new Vector3f(0.0f, 0.0f, 0.9f));
		TransformGroup earthRotGroupXformGroup = Posi.rotate(earthTransXformGroup, new Alpha(-1, 5000));
		TransformGroup jupiterRotGroupXformGroup = Posi.rotate(jupiterTransXformGroup, new Alpha(-1, 5000));
		TransformGroup saturnRotGroupXformGroup = Posi.rotate(saturnTransXformGroup, new Alpha(-1, 5000));
	    	group.addChild(earthRotGroupXformGroup);
	    	group.addChild(jupiterRotGroupXformGroup);
	    	group.addChild(saturnRotGroupXformGroup);
	    	group.addChild(solRotXformGroup);
	    	GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
	    	Canvas3D canvas = new Canvas3D(config); canvas.setSize(600, 1000);
	    	SimpleUniverse universe = new SimpleUniverse(canvas);
	    	universe.getViewingPlatform().setNominalViewingTransform();
	    	universe.addBranchGraph(group);  
	    	JFrame f = new JFrame("Planetario");
	    	f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
	    	f.add(canvas); f.pack(); f.setVisible(true); 
	}

	public static void main(String a[]) { 
		new SolarSis();
	}
}                                                                         
