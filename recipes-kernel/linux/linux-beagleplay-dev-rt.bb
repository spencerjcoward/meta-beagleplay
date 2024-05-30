SUMMARY = "An example kernel recipe that uses the linux-yocto and oe-core"
SECTION = "kernel"
LICENSE = "GPL-2.0-only"

inherit kernel

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/rt/linux-stable-rt.git;protocol=git;branch=v6.6-rt \
           file://defconfig-rt \
           file://k3-am625-beagleplay-dev.dtsi \
           file://0001-regulatory-firmware.patch \
           file://0002-add-custom-dtsi.patch"

SRCREV:aarch64="aaf558fa88cefb31e1c3e9b9cc90a5a263ee303c"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PV = "${LINUX_VERSION}"

S = "${WORKDIR}/git"

LINUX_VERSION ?= "6.6.32"
COMPATIBLE_MACHINE = "beagleplay-dev-rt"

do_configure:append() {
    cp ${WORKDIR}/k3-am625-beagleplay-dev.dtsi ${S}/arch/arm64/boot/dts/ti/
}