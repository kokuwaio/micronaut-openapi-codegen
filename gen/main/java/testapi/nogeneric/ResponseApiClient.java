package testapi.nogeneric;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client(id = "id")
public interface ResponseApiClient {

	java.lang.String PATH_ARRAY_COMPLEX = "/response/array-complex";
	java.lang.String PATH_ARRAY_COMPLEX_NOT_FOUND = "/response/array-complex-not-found";
	java.lang.String PATH_ARRAY_SIMPLE = "/response/array-simple";
	java.lang.String PATH_ARRAY_SIMPLE_EMPTY = "/response/array-simple-empty";
	java.lang.String PATH_ARRAY_SIMPLE_NOT_FOUND = "/response/array-simple-not-found";
	java.lang.String PATH_HEADER = "/response/header";
	java.lang.String PATH_MULTIPLE_DATA_TYPES = "/response/multiple-datatypes";
	java.lang.String PATH_MULTIPLE_DATA_TYPES_NOT_FOUND = "/response/multiple-datatypes-not-found";
	java.lang.String PATH_MULTIPLE_RESPONSE_CODES = "/response/multiple-response-codes";
	java.lang.String PATH_MULTIPLE_RESPONSE_CODES_NOT_FOUND = "/response/multiple-response-codes-not-found";
	java.lang.String PATH_OPTIONAL = "/response/optional";
	java.lang.String PATH_SINGLE = "/response/single";
	java.lang.String PATH_VOID_FOUND = "/response/void";
	java.lang.String PATH_VOID_NOT_FOUND = "/response/void-not-found";
	java.lang.String PATH_WITH_DEFAULT = "/response/default";

	@io.micronaut.http.annotation.Get(PATH_ARRAY_COMPLEX)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	java.util.List<StringModel> arrayComplex();

	@io.micronaut.http.annotation.Get(PATH_ARRAY_COMPLEX_NOT_FOUND)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	java.util.Optional<java.util.List<StringModel>> arrayComplexNotFound(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get(PATH_ARRAY_SIMPLE)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	java.util.List<java.lang.String> arraySimple();

	@io.micronaut.http.annotation.Get(PATH_ARRAY_SIMPLE_EMPTY)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	java.util.List<java.lang.String> arraySimpleEmpty();

	@io.micronaut.http.annotation.Get(PATH_ARRAY_SIMPLE_NOT_FOUND)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	java.util.Optional<java.util.List<java.lang.String>> arraySimpleNotFound(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get(PATH_HEADER)
	io.micronaut.http.HttpResponse<Object> header();

	@io.micronaut.http.annotation.Get(PATH_MULTIPLE_DATA_TYPES)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<Object> multipleDataTypes(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "redirect")
			java.lang.Boolean redirect);

	@io.micronaut.http.annotation.Get(PATH_MULTIPLE_DATA_TYPES_NOT_FOUND)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<Object> multipleDataTypesNotFound(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "redirect")
			java.lang.Boolean redirect,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get(PATH_MULTIPLE_RESPONSE_CODES)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<StringModel> multipleResponseCodes(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "redirect")
			java.lang.Boolean redirect);

	@io.micronaut.http.annotation.Get(PATH_MULTIPLE_RESPONSE_CODES_NOT_FOUND)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<StringModel> multipleResponseCodesNotFound(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "redirect")
			java.lang.Boolean redirect,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get(PATH_OPTIONAL)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	java.util.Optional<java.lang.String> optional(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get(PATH_SINGLE)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	java.lang.String single();

	@io.micronaut.http.annotation.Get(PATH_VOID_FOUND)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void voidFound();

	@io.micronaut.http.annotation.Get(PATH_VOID_NOT_FOUND)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void voidNotFound(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get(PATH_WITH_DEFAULT)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void withDefault();
}
