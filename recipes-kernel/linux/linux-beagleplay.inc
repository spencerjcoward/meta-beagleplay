SRC_URI:append:beagleplay-dev = "file://k3-am625-beagleplay-dev.dtsi \
                                 file://0001-regulatory-firmware.patch \
                                 file://0002-add-custom-dtsi.patch" 

do_configure:append:beagleplay-dev() {
    cp ${WORKDIR}/k3-am625-beagleplay-dev.dtsi ${S}/arch/arm64/boot/dts/ti/
}
