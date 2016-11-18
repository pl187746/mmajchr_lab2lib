#!/bin/sh
rm -rf depbin
git clone --branch=bin --depth=5 https://pl187746:$ASDF@github.com/pl187746/mmajchr_lab2lib depbin >> /dev/null 2>> /dev/null
cd depbin
rm -rf target
mkdir target
cp -f ../target/*.jar ./target/
git config --local user.name "Karol Kucharski"
git config --local user.email 187746@edu.p.lodz.pl
git add -A
git commit -m "Automatyczny build"
git push -f origin bin >> /dev/null 2>> /dev/null
cd ..
rm -rf depbin
echo "Build commited"
