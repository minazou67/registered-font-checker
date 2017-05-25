# Registered font checker
Output registered font information to standard output.  
Only information with style 0 is output.

## Environment
* Java 1.7 over

## Note
Java 1.7 FontManager has no getRegisteredFonts() static member.

## Usage
```console
$ java -jar registered-font-checker.jar
#### Default locale ####
ja_JP

#### Available font family names ####
DejaVu Sans
DejaVu Sans Mono
DejaVu Serif
Dialog
DialogInput
Lucida Bright
Lucida Sans
Lucida Sans Typewriter
Monospaced
SansSerif
Serif
Unifont
Unifont CSUR
Unifont Sample
Unifont Upper
Unifont Upper CSUR

#### Registered fonts ####
** Composite Font: Family=Serif Name=Serif.plain style=0
    Slot[0]=** TrueType Font: Family=Unifont Name=Unifont style=0 fileName=/usr/share/fonts/truetype/unifont/unifont.ttf
    Slot[1]=** TrueType Font: Family=Unifont CSUR Name=Unifont CSUR style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_csur.ttf
    Slot[2]=** TrueType Font: Family=DejaVu Serif Name=DejaVu Serif style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSerif.ttf
    Slot[3]=** TrueType Font: Family=DejaVu Serif Name=DejaVu Serif style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSerif.ttf
    Slot[4]=** TrueType Font: Family=DejaVu Sans Name=DejaVu Sans style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf
    Slot[5]=** TrueType Font: Family=DejaVu Sans Mono Name=DejaVu Sans Mono style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSansMono.ttf
    Slot[6]=** TrueType Font: Family=Unifont Upper Name=Unifont Upper style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_upper.ttf
    Slot[7]=** TrueType Font: Family=Unifont Upper CSUR Name=Unifont Upper CSUR style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_upper_csur.ttf

** Composite Font: Family=SansSerif Name=SansSerif.plain style=0
    Slot[0]=** TrueType Font: Family=Unifont Name=Unifont style=0 fileName=/usr/share/fonts/truetype/unifont/unifont.ttf
    Slot[1]=** TrueType Font: Family=Unifont CSUR Name=Unifont CSUR style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_csur.ttf
    Slot[2]=** TrueType Font: Family=DejaVu Sans Name=DejaVu Sans style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf
    Slot[3]=** TrueType Font: Family=DejaVu Sans Name=DejaVu Sans style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf
    Slot[4]=** TrueType Font: Family=DejaVu Sans Mono Name=DejaVu Sans Mono style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSansMono.ttf
    Slot[5]=** TrueType Font: Family=DejaVu Serif Name=DejaVu Serif style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSerif.ttf
    Slot[6]=** TrueType Font: Family=Unifont Upper Name=Unifont Upper style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_upper.ttf
    Slot[7]=** TrueType Font: Family=Unifont Upper CSUR Name=Unifont Upper CSUR style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_upper_csur.ttf

** Composite Font: Family=Monospaced Name=Monospaced.plain style=0
    Slot[0]=** TrueType Font: Family=Unifont Name=Unifont style=0 fileName=/usr/share/fonts/truetype/unifont/unifont.ttf
    Slot[1]=** TrueType Font: Family=Unifont CSUR Name=Unifont CSUR style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_csur.ttf
    Slot[2]=** TrueType Font: Family=DejaVu Sans Mono Name=DejaVu Sans Mono style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSansMono.ttf
    Slot[3]=** TrueType Font: Family=DejaVu Sans Name=DejaVu Sans style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf
    Slot[4]=** TrueType Font: Family=DejaVu Serif Name=DejaVu Serif style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSerif.ttf
    Slot[5]=** TrueType Font: Family=Unifont Upper Name=Unifont Upper style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_upper.ttf
    Slot[6]=** TrueType Font: Family=Unifont Upper CSUR Name=Unifont Upper CSUR style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_upper_csur.ttf

** Composite Font: Family=Dialog Name=Dialog.plain style=0
    Slot[0]=** TrueType Font: Family=Unifont Name=Unifont style=0 fileName=/usr/share/fonts/truetype/unifont/unifont.ttf
    Slot[1]=** TrueType Font: Family=Unifont CSUR Name=Unifont CSUR style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_csur.ttf
    Slot[2]=** TrueType Font: Family=DejaVu Sans Name=DejaVu Sans style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf
    Slot[3]=** TrueType Font: Family=DejaVu Sans Name=DejaVu Sans style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf
    Slot[4]=** TrueType Font: Family=DejaVu Sans Mono Name=DejaVu Sans Mono style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSansMono.ttf
    Slot[5]=** TrueType Font: Family=DejaVu Serif Name=DejaVu Serif style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSerif.ttf
    Slot[6]=** TrueType Font: Family=Unifont Upper Name=Unifont Upper style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_upper.ttf
    Slot[7]=** TrueType Font: Family=Unifont Upper CSUR Name=Unifont Upper CSUR style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_upper_csur.ttf

** Composite Font: Family=DialogInput Name=DialogInput.plain style=0
    Slot[0]=** TrueType Font: Family=Unifont Name=Unifont style=0 fileName=/usr/share/fonts/truetype/unifont/unifont.ttf
    Slot[1]=** TrueType Font: Family=Unifont CSUR Name=Unifont CSUR style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_csur.ttf
    Slot[2]=** TrueType Font: Family=DejaVu Sans Mono Name=DejaVu Sans Mono style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSansMono.ttf
    Slot[3]=** TrueType Font: Family=DejaVu Sans Name=DejaVu Sans style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf
    Slot[4]=** TrueType Font: Family=DejaVu Serif Name=DejaVu Serif style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSerif.ttf
    Slot[5]=** TrueType Font: Family=Unifont Upper Name=Unifont Upper style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_upper.ttf
    Slot[6]=** TrueType Font: Family=Unifont Upper CSUR Name=Unifont Upper CSUR style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_upper_csur.ttf

** TrueType Font: Family=Unifont Name=Unifont style=0 fileName=/usr/share/fonts/truetype/unifont/unifont.ttf
** TrueType Font: Family=Unifont Upper Name=Unifont Upper style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_upper.ttf
** TrueType Font: Family=DejaVu Sans Mono Name=DejaVu Sans Mono style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSansMono.ttf
** TrueType Font: Family=Lucida Sans Typewriter Name=Lucida Sans Typewriter Regular style=0 fileName=/opt/jdk1.8.0_45/jre/lib/fonts/LucidaTypewriterRegular.ttf
** TrueType Font: Family=Unifont CSUR Name=Unifont CSUR style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_csur.ttf
** TrueType Font: Family=Lucida Bright Name=Lucida Bright Regular style=0 fileName=/opt/jdk1.8.0_45/jre/lib/fonts/LucidaBrightRegular.ttf
** TrueType Font: Family=DejaVu Serif Name=DejaVu Serif style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSerif.ttf
** TrueType Font: Family=Lucida Sans Name=Lucida Sans Regular style=0 fileName=/opt/jdk1.8.0_45/jre/lib/fonts/LucidaSansRegular.ttf
** TrueType Font: Family=DejaVu Sans Name=DejaVu Sans style=0 fileName=/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf
** TrueType Font: Family=Unifont Sample Name=Unifont Sample Medium style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_sample.ttf
** TrueType Font: Family=Unifont Upper CSUR Name=Unifont Upper CSUR style=0 fileName=/usr/share/fonts/truetype/unifont/unifont_upper_csur.ttf
```
