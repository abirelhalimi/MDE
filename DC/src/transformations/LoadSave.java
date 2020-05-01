package transformations;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import dC.DCPackage;
import dC.StateMachine;
import dC.Transition;

public class LoadSave {
	
static EList<Transition> list ;
	
	public static StateMachine LoadModel(String modelName,String pathModel) {
		DCPackage.eINSTANCE.eClass();
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put(modelName, new XMIResourceFactoryImpl());
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
        Resource resource = resSet.getResource(URI.createURI(pathModel), true);
       
        StateMachine model = (StateMachine) resource.getContents().get(0);
        return model;
	}
	public static void SaveTransformedModel(String outputM, StateMachine model) throws FileNotFoundException, IOException {

		System.out.println(model);
	     ResourceSet resSet = new ResourceSetImpl();
	     resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

	     File out = new File(outputM);
	     Resource xmiResource = resSet.createResource(URI.createFileURI(out.toString()));
	     System.out.println(model);
	 	 xmiResource.getContents().add(model);
	 
	 	 xmiResource.save(null);
	 	 System.out.println("Saved " + outputM);
		
	}

}
