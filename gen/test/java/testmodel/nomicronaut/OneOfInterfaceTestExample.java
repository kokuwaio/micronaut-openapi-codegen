package testmodel.nomicronaut;

public class OneOfInterfaceTestExample {

	public static OneOfInterface build() {
		return OneOfImplementor1TestExample.build();
	}
}
