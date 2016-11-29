
package ocpp.cp._2010._08;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ResetType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ResetType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Hard"/&gt;
 *     &lt;enumeration value="Soft"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResetType")
@XmlEnum
public enum ResetType {

    @XmlEnumValue("Hard")
    HARD("Hard"),
    @XmlEnumValue("Soft")
    SOFT("Soft");
    private final String value;

    ResetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResetType fromValue(String v) {
        for (ResetType c: ResetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
