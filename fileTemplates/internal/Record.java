#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

/**
 * 
 *
 * @author  ChuanFu
 * @date    ${YEAR}-${MONTH}-${DAY}
 **/
public record ${NAME}(#[[$END$]]#) {
}
