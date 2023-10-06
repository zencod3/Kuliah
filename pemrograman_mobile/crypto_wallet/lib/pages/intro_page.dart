import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:crypto_wallet/components/button.dart';
import 'package:crypto_wallet/themes/colors.dart';

class IntroPage extends StatelessWidget {
  const IntroPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: bgPrimary,
      body: Padding(
        padding: const EdgeInsets.all(15.0),
        child: Column(mainAxisAlignment: MainAxisAlignment.center, children: [
          // Icon
          Padding(
            padding: const EdgeInsets.all(50.0),
            child: Image.asset('lib/assets/icons/bitcoin.png'),
          ),

          // Title
          Text(
            "Welcome To ZenPay",
            style: GoogleFonts.openSans(
                fontSize: 28, color: Colors.white, fontWeight: FontWeight.bold),
          ),
          const SizedBox(
            height: 10,
          ),

          // Subtitle
          Text(
            "Connecting you to Ethereum and the\nDecentralize web.",
            style: GoogleFonts.openSans(
              fontSize: 16,
              color: lightColor,
            ),
            textAlign: TextAlign.center,
          ),
          const SizedBox(
            height: 75,
          ),

          // Button
          MyButton(
            textInput: "Create Account",
            buttonColorInput: bgPrimary,
            useBorderInput: true,
            borderColorInput: darkColor,
            onTap: () {
              Navigator.pushNamed(context, '/loginpage');
            },
          ),
          const SizedBox(
            height: 15,
          ),
          MyButton(
              textInput: "Get Started",
              buttonColorInput: gradientColor,
              useBorderInput: false,
              borderColorInput: null,
              onTap: () {
                Navigator.pushNamed(context, '/menupage');
              }),
          const SizedBox(
            height: 50,
          ),
        ]),
      ),
    );
  }
}
