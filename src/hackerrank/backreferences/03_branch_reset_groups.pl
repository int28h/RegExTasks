/*
NOTE - Branch reset group is supported by Perl, PHP, Delphi and R.

A branch reset group consists of alternations and capturing groups. (?|(regex1)|(regex2))
Alternatives in branch reset group share same capturing group.

[ach20.png]

Task

You have a test string S.
Your task is to write a regex which will match S, with following conditions:

S consists of 8 digits.
S must have "---", "-", "." or ":" separator such that string S gets divided in 4 parts, 
with each part having exactly two digits.
S string must have exactly one kind of separator.
Separators must have integers on both sides.

Valid S

12-34-56-78
12:34:56:78
12---34---56---78
12.34.56.78

Invalid S

1-234-56-78
12-45.78:10
*/

$Regex_Pattern = '^\d\d(?|(---)|(-)|(\.)|(:))\d\d\1\d\d\1\d\d$';

$Test_String = <STDIN> ;
if($Test_String =~ /$Regex_Pattern/){
    print "true";
} else {
    print "false";
}
