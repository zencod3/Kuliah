import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';

class MyButton extends StatelessWidget {
  final String textInput;
  final dynamic buttonColorInput;
  final bool useBorderInput;
  final Color? borderColorInput;
  final void Function()? onTap;

  const MyButton({
    Key? key,
    required this.textInput,
    required this.buttonColorInput,
    this.useBorderInput = false,
    this.borderColorInput,
    required this.onTap,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: onTap,
      child: Container(
        decoration: BoxDecoration(
          gradient: buttonColorInput is Gradient ? buttonColorInput : null,
          color: buttonColorInput is Color ? buttonColorInput : null,
          borderRadius: BorderRadius.circular(10),
          border: useBorderInput ? Border.all(color: borderColorInput ?? Colors.black) : null,
        ),
        padding: EdgeInsets.all(15),
        width: double.infinity,
        child: Text(
          textInput,
          style: GoogleFonts.openSans(fontSize: 16, color: Colors.white),
          textAlign: TextAlign.center,
        ),
      ),
    );
  }
}
