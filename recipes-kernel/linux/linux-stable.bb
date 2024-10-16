SUMMARY = "An example kernel recipe that uses the linux-yocto and oe-core"
SECTION = "kernel"
LICENSE = "GPL-2.0-only"

inherit kernel
require recipes-kernel/linux/linux-beagleplay.inc
require recipes-kernel/linux/linux-beagleyai.inc


SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;protocol=git;branch=linux-6.11.y \
           file://defconfig "

SRCREV="${AUTOREV}"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
PV = "${LINUX_VERSION}"

S = "${WORKDIR}/git"

LINUX_VERSION ?= "6.11"
