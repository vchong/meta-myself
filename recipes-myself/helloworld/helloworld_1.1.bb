DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://helloworld.c;startline=1;endline=10;md5=0ad854fb488587e2d2a99396e3b41d7a"

SRC_URI = "file://helloworld.c"
SRC_URI += "file://Makefile"

S = "${WORKDIR}"

do_compile() {
    #${CC} helloworld.c -o helloworld
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 helloworld ${D}${bindir}
}
