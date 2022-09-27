package testapi.nogeneric;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class Multipart {
	public static final java.lang.String JSON_PROPERTY_ORDER_ID = "orderId";
	public static final java.lang.String JSON_PROPERTY_USER_ID = "userId";
	public static final java.lang.String JSON_PROPERTY_FILE_NAME = "fileName";
	public static final java.lang.String JSON_PROPERTY_FILE = "file";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ORDER_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer orderId;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_USER_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer userId;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_FILE_NAME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String fileName;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_FILE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private byte[] file;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		Multipart other = (Multipart) object;
		return java.util.Objects.equals(orderId, other.orderId)
				&& java.util.Objects.equals(userId, other.userId)
				&& java.util.Objects.equals(fileName, other.fileName)
				&& java.util.Arrays.equals(file, other.file);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(orderId, userId, fileName, java.util.Arrays.hashCode(file));
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("Multipart[")
				.append("orderId=").append(orderId).append(",")
				.append("userId=").append(userId).append(",")
				.append("fileName=").append(fileName).append(",")
				.append("file.length=").append(file == null ? null : file.length)
				.append("]")
				.toString();
	}

	// fluent

	public Multipart orderId(java.lang.Integer newOrderId) {
		this.orderId = newOrderId;
		return this;
	}

	public Multipart userId(java.lang.Integer newUserId) {
		this.userId = newUserId;
		return this;
	}

	public Multipart fileName(java.lang.String newFileName) {
		this.fileName = newFileName;
		return this;
	}

	public Multipart file(byte[] newFile) {
		this.file = newFile;
		return this;
	}


	public java.lang.Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(java.lang.Integer newOrderId) {
		this.orderId = newOrderId;
	}

	public java.lang.Integer getUserId() {
		return userId;
	}

	public void setUserId(java.lang.Integer newUserId) {
		this.userId = newUserId;
	}

	public java.lang.String getFileName() {
		return fileName;
	}

	public void setFileName(java.lang.String newFileName) {
		this.fileName = newFileName;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] newFile) {
		this.file = newFile;
	}
}

