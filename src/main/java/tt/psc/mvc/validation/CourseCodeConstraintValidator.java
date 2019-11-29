package tt.psc.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode typedCode) {
        coursePrefix = typedCode.value();
        System.out.println(coursePrefix);
    }

    @Override
    public boolean isValid(String typedValueFromUser, ConstraintValidatorContext constraintValidatorContext) {
        return typedValueFromUser == null || typedValueFromUser.startsWith(coursePrefix);
    }
}
