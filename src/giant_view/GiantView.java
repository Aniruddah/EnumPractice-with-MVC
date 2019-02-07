package giant_view;

import giant_controller.GiantController;
import giant_model.FatigueModel;
import giant_model.GiantModel;
import giant_model.HealthModel;
import giant_model.NourishmentModel;

public class GiantView {

	public void showGiant(GiantModel giantModel)
	{

			System.out.println(giantModel.getHealth());
			System.out.println(giantModel.getFatigue());
			System.out.println(giantModel.getNourishment());

	}
public static void main (String[] args) {
		
		HealthModel health=HealthModel.Active;
		FatigueModel fatigue=FatigueModel.Dizzy;
		NourishmentModel nourishment=NourishmentModel.Protein;
		
		
		GiantModel giantModel =new GiantModel(health,fatigue,nourishment);
		
		GiantView giantView=new GiantView();
		
		GiantController giantController=new GiantController(giantModel, giantView);

		giantController.updateView();
		
		
	}

}
