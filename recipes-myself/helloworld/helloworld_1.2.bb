DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;;md5=e1d52b8a05466e6daf0b7a9aac2ec7de"

SRC_URI = "file://helloworld.c"
SRC_URI += "file://Makefile.am"
SRC_URI += "file://configure.ac"
SRC_URI += "file://COPYING"

S = "${WORKDIR}"

inherit autotools
