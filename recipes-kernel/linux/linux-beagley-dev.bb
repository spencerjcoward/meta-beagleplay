SUMMARY = "An example kernel recipe that uses the linux-yocto and oe-core"
SECTION = "kernel"
LICENSE = "GPL-2.0-only"

inherit kernel

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;protocol=git;branch=linux-6.11.y \
           file://defconfig \
           file://0001-regulatory-firmware.patch \
           file://0003-arm64-dts-ti-Add-k3-am67a-beagley-ai.patch" 

SRCREV:aarch64="98f7e32f20d28ec452afb208f9cffc08448a2652"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
PV = "${LINUX_VERSION}"

S = "${WORKDIR}/git"

LINUX_VERSION ?= "6.11"
#COMPATIBLE_MACHINE = "beagleplay-dev beagleyai beagleyai-k3r5"

