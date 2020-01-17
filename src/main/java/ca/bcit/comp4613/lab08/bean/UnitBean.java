package ca.bcit.comp4613.lab08.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;


@ManagedBean(name = "unit")
@SessionScoped
public class UnitBean implements Serializable {

		private static final long serialVersionUID = 1L;
		private double distance = 0;
		private String measureUnit = null;
		private String distanceConvert = null;

		public double getDistance() {
			return distance;
		}

		public void setDistance(double distance) {
			this.distance = distance;
		}

		public String getMeasureUnit() {
			return measureUnit;
		}

		public void setMeasureUnit(String measureUnit) {
			this.measureUnit = measureUnit;
		}

		public String getDistanceConvert() {
			return distanceConvert;
		}

		public void setDistanceConvert(String distanceConvert) {
			this.distanceConvert = distanceConvert;
		}

		public void handleConvertClick(ActionEvent e) {
			distanceConvert = "";
			if (measureUnit.equals("mi")) {
				double convertedDistance = distance * 1.609344;
				distanceConvert = Double.toString(convertedDistance) + " Kilometers";
			} else if (measureUnit.equals("km")) {
				double convertedDistance = distance * 0.62137;
				distanceConvert = Double.toString(convertedDistance) + " Miles";
			}
		}

}
