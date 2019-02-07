package giant_controller;

import giant_model.GiantModel;
import giant_view.GiantView;

public class GiantController {
	GiantModel giantModel = new GiantModel();
	GiantView giantView = new GiantView();
	
	public GiantController(GiantModel giantModel, GiantView giantView) {
		
		this.giantModel = giantModel;
		this.giantView = giantView;
	}
	
	
	public void updateView() {
		
		giantView.showGiant(giantModel);
	}
		
	
}