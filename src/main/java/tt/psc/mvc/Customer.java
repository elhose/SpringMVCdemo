package tt.psc.mvc;

import tt.psc.mvc.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "pleaz gib lastName")
    @Size(min = 1, message = "ej BQ ej")
    private String lastName;

    @NotNull(message = "pleaz givee freePass")
    @Min(value = 0, message = "za malo, typie, dodatnia liczba")
    @Max(value = 10, message = "za duzo, gosciu, mniej niz 11")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "5 znakow tylko bQ")
    private String postalCode;

    @CourseCode
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
