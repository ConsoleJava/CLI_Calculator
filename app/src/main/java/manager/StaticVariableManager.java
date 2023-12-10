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
     또한 입력된 '$x = 수식' 혹은 '$x = 피연산자'의 길이는 200자를 넘어갈 수 없습니다.
     $x 에서 ‘x’는 영어 소문자와 숫자로 이루어진 문자열이며 '$'와 문자열 'x' 사이 그리고 x 문자열 내부에는 어떠한 공백 및 문자를 포함할 수 없습니다.
     반드시 연속된 문자열로 표시하여 사용해야합니다.
     이름이 다른 저장결과값들은 모두 별개의 저장결과값으로 취급되며, 저장결과값의 개수 제한은 없습니다.
     동일한 이름의 저장결과값일 경우, 가장 최근에 정의한 값으로 업데이트합니다.
  5. 사용가능한 연산자는 '+', '-', '*', '/', '^' '(', ')' 입니다.
  6. 문자 @a[%b, %c]는 함수를 의미합니다.
     함수는 수식을 계산하거나 표현하기 위해 연산자와 피연산자의 조합으로 이루어진 표현식으로, 수식에서 피연산자로 사용됩니다.
     함수 정의 방법은 ‘@a[%b, %c, …] = ‘문자열 이후에는 수식이 입력되어야 하며, 이때 사용되는 수식에는 매개변수가 사용될 수 있습니다. 단, 피연산자 중 함수는 수식에 사용할 수 없습니다.
     함수 사용 시에는 매개변수에 계산값이 존재하는 피연산자를 대입하여 사용합니다.
     이름이 다른 함수들은 모두 별개의 함수로 취급되며, 함수의 개수 제한은 없습니다.
     동일한 함수 이름일 경우, 가장 최근에 정의한 함수로 업데이트합니다.
  7. 수식의 문자열의 길이는 200까지 받을 수 있습니다.
  8. 수학적 정의에 올바른 수식만 받을 수 있습니다.
     Ex) 0으로 나누려한 경우, 괄호의 짝이 맞이 않는 경우 등등 수학적 정의를 어긴 수식은 계산할 수 없습니다.
  9. 계산 과정 중 사용 규칙을 어길 경우, 오류 문구를 출력하고 재입력을 받습니다.
""";

public static String calculatorString = "계산할 수식을 입력해주세요: ";
public static String exitString = "\n계산기를 종료합니다.";
}

