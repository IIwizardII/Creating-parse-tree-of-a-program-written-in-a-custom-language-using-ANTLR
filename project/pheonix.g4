grammar pheonix;

start: begin function+ end;

begin: '$start';

function: dataType functionName '(' ')' functionBlock ;
dataType: 'int' 
			| 'float' 
			| 'char' 
			| 'string' 
			| 'boolean';
			
functionName: variable;
functionBlock: '[' functionWork returnValue ']';
functionWork: (variableDeclaration 
			|valueAssignment
			|conditionalStatement
			|loop
			|function
			)+ ;

variableDeclaration: dataType variable '.';

valueAssignment: (variable '=' Digit '.') 
				| (variable '=' variable '.')
				| (variable '=' arithmeticCalculation '.');
				
arithmeticCalculation: variable arithmeticOperator variable;
arithmeticOperator: '+' 
					| '-' 
					| '/' 
					| '*' 
					| '%';

conditionalStatement: 'when' '(' condition ')' conditionalBlock ('or' '(' condition ')' conditionalBlock)*;
condition: variable conditionalOperator variable;
conditionalOperator: '>'
					| '<'
					| '=='
					| '>='
					| '<='
					| '!=';
					
conditionalBlock: '[' conditionalStatementWork ']';
conditionalStatementWork: (valueAssignment
						|conditionalStatement
						| loop
						|function)+;
	
loop: 'run' '(' 'from' val 'to' val valChange ')' loopBlock;
loopBlock: '[' loopWork  ']';
loopWork: (valueAssignment
		|conditionalStatement
		|function
		|loop
		)+;

valChange: val '=' val arithmeticOperator val;
val: Digit;

returnValue: 'return' Digit '.';
variable: Letter (Letter | Digit)*;
Letter: [a-zA-Z]+;
Digit: [0-9]+;

WS : [ \t\r\n]+ -> skip;

end: '$end';
