require u-boot-ti.inc

PR = "r0"

PV = "2024.07-rc4"

# For the un-initiated:
# The actual URL you'd use with a git clone for example would be:
# https://source.denx.de/u-boot/u-boot.git/
# However, in the context of OE, we have to explicitly split things up:
# a) we want it to use git fetcher - hence git:// prefix in GIT_URI (if we
#  used https here, we'd endup attempting wget instead of git)
# b) and we want git fetcher to use https protocol, hence GIT_PROTOCOL as https
UBOOT_GIT_URI = "git://source.denx.de/u-boot/u-boot.git"
UBOOT_GIT_PROTOCOL = "https"
SRCREV = "c0ea27bccfb7d2d37fd36806ac2a2f7389099420"
