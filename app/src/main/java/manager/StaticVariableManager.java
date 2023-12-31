package manager;

public class StaticVariableManager {
  
  public static double resultBuffer = Double.NaN;

  public static String menuString = """
    1. 사용 설명
    2. 계산하기
    3. 프로그램 종료
    """;
    
  public static String scriptString = """
    
  계산기의 사용 규칙 설명서입니다.
  1. 이 계산기는 결과값이 소수인 경우 소수점 6자리까지만 표시하며,
     결과값은 근사치를 가질 수 있습니다.
  2. 계산의 결과로는 결과출력제한을 지키는 결과값만 출력할 수 있습니다.
  3. 문자 '_'는 직전 결과값을 의미합니다.
     직전 결과값이란 가장 최근에 정상적으로 계산된 결과값을 의미하는 피연산자입니다.
  4. 문자가 '$x'는 저장 결과값을 의미합니다.
     저장 결과값이란 사용자가 임의로 지정한 값 혹은 수식의 결과값을 의미하는 피연산자입니다.
     저장 방법은 '$x = 수식' 혹은 '$x = 피연산자'의 형태로 값을 저장합니다.
     단, 사용되는 수식과 피연산자에는 '$x'가 포함될 수 없습니다.
    또한 입력된 '$x = 수식' 혹은 '$x = 피연산자'의 길이는 200자를 넘어갈 수 없습니다.
  5. 사용가능한 연산자는 '+', '-', '*', '/', '^' '(', ')' 입니다.
  6. '+', '-', '*', '/', '^' 연산자와 '(', ')', 피연산자 사이에는 반드시 공백이 존재해야 합니다.
  7. 음수를 표현하고자 하는 경우에는 반드시 음수부호 '-'를 피연산자 사이에 공백없이 붙여서 사용합니다.
  8. 수식의 문자열의 길이는 200까지 받을 수 있습니다.
  9. 수학적 정의에 올바른 수식만 받을 수 있습니다.
     ex) 0으로 나누려한 경우, 괄호의 짝이 맞이 않는 경우 등등 수학적 정의를 어긴 수식은 계산할 수 없습니다.
  10. 계산 과정 중 사용 규칙을 어길 경우, 오류 문구를 출력하고 재입력을 받습니다.
""";

public static String calculatorString = "계산할 수식을 입력해주세요: ";
public static String exitString = "\n계산기를 종료합니다.";
}

