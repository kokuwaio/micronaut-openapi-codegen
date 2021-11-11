package testapi.nooptional;

/** Test for {@link ResponseApi}. */
@io.micronaut.core.annotation.Generated
public interface ResponseApiTestSpec { 

	// arrayComplex

	void arrayComplex200() throws java.lang.Exception;

	// arrayComplexNotFound

	void arrayComplexNotFound200() throws java.lang.Exception;

	void arrayComplexNotFound404() throws java.lang.Exception;

	// arraySimple

	void arraySimple200() throws java.lang.Exception;

	// arraySimpleEmpty

	void arraySimpleEmpty200() throws java.lang.Exception;

	// arraySimpleNotFound

	void arraySimpleNotFound200() throws java.lang.Exception;

	void arraySimpleNotFound404() throws java.lang.Exception;

	// header

	void header200() throws java.lang.Exception;

	// multipleDataTypes

	void multipleDataTypes200() throws java.lang.Exception;

	void multipleDataTypes300() throws java.lang.Exception;

	// multipleDataTypesNotFound

	void multipleDataTypesNotFound200() throws java.lang.Exception;

	void multipleDataTypesNotFound300() throws java.lang.Exception;

	void multipleDataTypesNotFound404() throws java.lang.Exception;

	// multipleResponseCodes

	void multipleResponseCodes200() throws java.lang.Exception;

	void multipleResponseCodes300() throws java.lang.Exception;

	// multipleResponseCodesNotFound

	void multipleResponseCodesNotFound200() throws java.lang.Exception;

	void multipleResponseCodesNotFound300() throws java.lang.Exception;

	void multipleResponseCodesNotFound404() throws java.lang.Exception;

	// optional

	void optional200() throws java.lang.Exception;

	void optional404() throws java.lang.Exception;

	// single

	void single200() throws java.lang.Exception;

	// voidFound

	void voidFound204() throws java.lang.Exception;

	// voidNotFound

	void voidNotFound204() throws java.lang.Exception;

	void voidNotFound404() throws java.lang.Exception;
}
