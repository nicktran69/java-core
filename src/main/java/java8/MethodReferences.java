package java8;

import org.apache.commons.lang3.StringUtils;
import java.util.*;

public class MethodReferences {

    /**
     *  METHOD REFERENCES
     */
    public static void methodReferencesExample() {
        // 1. Reference to a Static Method
        List<String> messages = Arrays.asList("Hello", "Ciao", "Konichiwa");
        // lambda expression
        messages.forEach(message -> StringUtils.capitalize(message));
        messages.forEach(message -> System.out.println(message));
        // use method references
        messages.forEach(StringUtils::capitalize);
        messages.forEach(message -> System.out.println(message));

        // 2. Reference to an Instance Method of a Particular Object

    }

    class Bicycle {
        private String brand;
        private Integer frameSize;

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public Integer getFrameSize() {
            return frameSize;
        }

        public void setFrameSize(Integer frameSize) {
            this.frameSize = frameSize;
        }
    }

    interface Comparator {
        int compare(Bicycle a, Bicycle b);
    }

    class BicycleComparator implements Comparator {

        @Override
        public int compare(Bicycle a, Bicycle b) {
            return a.getFrameSize().compareTo(b.getFrameSize());
        }
    }

    public static void main(String[] args) {
        methodReferencesExample();
    }
}

