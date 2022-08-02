package j14_lombok;

public class Builder extends CarBuilder {
	
	

	@Override
	public Car build() {
		return super.build();
	}

	@Override
	public CarBuilder builder() {
		return super.builder();
	}

	@Override
	public CarBuilder company(String company) {
		car.setCompany(company);
		return this;
	}

	@Override
	public CarBuilder model(String model) {
		car.setModel(model);
		return this;
	}

	@Override
	public CarBuilder color(String color) {
		car.setColor(color);
		return this;
	}

	
}
