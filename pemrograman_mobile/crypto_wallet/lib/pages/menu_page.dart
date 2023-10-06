import 'package:crypto_wallet/themes/colors.dart';
import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';

class MenuPage extends StatefulWidget {
  const MenuPage({Key? key}) : super(key: key);

  @override
  State<MenuPage> createState() => _MenuPageState();
}

class _MenuPageState extends State<MenuPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Color(0xFF18182f),
      appBar: AppBar(
        backgroundColor: Colors.transparent,
        elevation: 0,
        leading: Icon(Icons.menu),
        title: Text('BSC-20'),
      ),
      body: Column(
        children: [
          Container(
            decoration: BoxDecoration(
              color: primaryColor,
              borderRadius: BorderRadius.circular(10),
            ),
            margin: const EdgeInsets.all(15),
            padding: const EdgeInsets.all(20),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    Text("Multi-Coin Wallet",
                        style: GoogleFonts.openSans(
                            color: Colors.white, fontSize: 16)),
                    Icon(
                      Icons.more_horiz,
                      color: Colors.white,
                    ),
                  ],
                ),
                const SizedBox(
                  height: 5,
                ),
                Text(
                  "\$224.90",
                  style: GoogleFonts.openSans(
                      color: Colors.white,
                      fontSize: 28,
                      fontWeight: FontWeight.bold),
                  textAlign: TextAlign.left,
                ),
                const SizedBox(
                  height: 30,
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    Row(
                      children: [
                        Text("0x8b3b56...4c9992",
                            style: GoogleFonts.openSans(
                                color: Colors.white, fontSize: 12)),
                        const SizedBox(
                          width: 10,
                        ),
                        Icon(
                          Icons.copy_outlined,
                          size: 16,
                          color: Colors.white,
                        ),
                      ],
                    ),
                    Row(
                      children: [
                        Icon(
                          Icons.safety_check,
                          color: Colors.white,
                        ),
                      ],
                    ),
                  ],
                ),
              ],
            ),
          ),
          Container(
            margin: const EdgeInsets.symmetric(horizontal: 10),
            padding: const EdgeInsets.all(20),
            child: Center(
              child: Row(
                mainAxisAlignment: MainAxisAlignment.spaceBetween,
                children: <Widget>[
                  Column(
                    children: [
                      FloatingActionButton(
                        onPressed: () {},
                        child: Icon(Icons.shopping_cart),
                        backgroundColor: Colors.blue,
                      ),
                      const SizedBox(
                        height: 10,
                      ),
                      Text("Buy",
                          style: GoogleFonts.openSans(
                              color: Colors.white, fontSize: 12)),
                    ],
                  ),
                  Column(
                    children: [
                      FloatingActionButton(
                        onPressed: () {},
                        child: Icon(Icons.sell),
                        backgroundColor: Colors.blue,
                      ),
                      const SizedBox(
                        height: 10,
                      ),
                      Text("Sell",
                          style: GoogleFonts.openSans(
                              color: Colors.white, fontSize: 12)),
                    ],
                  ),
                  Column(
                    children: [
                      FloatingActionButton(
                        onPressed: () {},
                        child: Icon(Icons.swap_horiz),
                        backgroundColor: Colors.blue,
                      ),
                      const SizedBox(
                        height: 10,
                      ),
                      Text("Swap",
                          style: GoogleFonts.openSans(
                              color: Colors.white, fontSize: 12)),
                    ],
                  ),
                  Column(
                    children: [
                      FloatingActionButton(
                        onPressed: () {},
                        child: Icon(Icons.attach_money),
                        backgroundColor: Colors.blue,
                      ),
                      const SizedBox(
                        height: 10,
                      ),
                      Text("Deposit",
                          style: GoogleFonts.openSans(
                              color: Colors.white, fontSize: 12)),
                    ],
                  ),
                ],
              ),
            ),
          ),
          Container(
            margin: const EdgeInsets.symmetric(horizontal: 10),
            padding: const EdgeInsets.all(20),
            child: Column(
              children: [
                Row(
                  children: [
                    Text("Assets",
                        style: GoogleFonts.openSans(
                            color: Colors.white, fontSize: 12)),
                    Text("NFTs",
                        style: GoogleFonts.openSans(
                            color: Colors.white, fontSize: 12))
                  ],
                ),
                Row(
                  children: [Column()],
                )
              ],
            ),
          )
        ],
      ),
      bottomNavigationBar: BottomNavigationBar(
        items: const <BottomNavigationBarItem>[
          BottomNavigationBarItem(
            backgroundColor: Colors.black,
            icon: Icon(Icons.person),
            label: 'Person',
          ),
          BottomNavigationBarItem(
            backgroundColor: Colors.black,
            icon: Icon(Icons.directions_car),
            label: 'Car',
          ),
          BottomNavigationBarItem(
            backgroundColor: Colors.black,
            icon: Icon(Icons.qr_code),
            label: 'QR Code',
          ),
          BottomNavigationBarItem(
            backgroundColor: Colors.black,
            icon: Icon(Icons.music_note),
            label: 'Music',
          ),
          BottomNavigationBarItem(
            backgroundColor: Colors.black,
            icon: Icon(Icons.settings),
            label: 'Settings',
          ),
        ],
        currentIndex: 2,
        selectedItemColor: Colors.purple,
        backgroundColor: Colors.black,
        // fixedColor: Colors.black,
        unselectedItemColor: Colors.black,
      ),
    );
  }
}
