package testapi.types;

/** Test for {@link MediatypeApi}. */
public interface MediatypeApiTestSpec { 

	// mediatypeConsumesAndProduces

	void mediatypeConsumesAndProduces200() throws java.lang.Exception;

	// mediatypeConsumesMultipartWithFileUpload

	void mediatypeConsumesMultipartWithFileUpload200() throws java.lang.Exception;

	// mediatypeConsumesMultipartWithoutFileUpload

	void mediatypeConsumesMultipartWithoutFileUpload200() throws java.lang.Exception;

	// mediatypeConsumesOctetStream

	void mediatypeConsumesOctetStream200() throws java.lang.Exception;

	// mediatypeConsumesPlain

	void mediatypeConsumesPlain200() throws java.lang.Exception;

	// mediatypeProducesDifferentModel

	void mediatypeProducesDifferentModel200() throws java.lang.Exception;

	// mediatypeProducesSameModel

	void mediatypeProducesSameModel200() throws java.lang.Exception;
}
