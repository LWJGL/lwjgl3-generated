/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** This union is defined so Xlib can always use the same sized event structure internally, to avoid memory fragmentation. */
public final class XEvent implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		XANY,
		XKEY,
		XBUTTON,
		XMOTION,
		XCONFIGURE,
		XPROPERTY,
		XSELECTIONREQUEST,
		XSELECTION,
		XCLIENT,
		XERROR,
		XCOOKIE,
		PAD;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(13);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		XANY = offsets.get(1);
		XKEY = offsets.get(2);
		XBUTTON = offsets.get(3);
		XMOTION = offsets.get(4);
		XCONFIGURE = offsets.get(5);
		XPROPERTY = offsets.get(6);
		XSELECTIONREQUEST = offsets.get(7);
		XSELECTION = offsets.get(8);
		XCLIENT = offsets.get(9);
		XERROR = offsets.get(10);
		XCOOKIE = offsets.get(11);
		PAD = offsets.get(12);
	}

	private final ByteBuffer struct;

	public XEvent() {
		this(malloc());
	}

	public XEvent(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public void setType(int type) { type(struct, type); }
	public void setXany(long xany) { xanySet(struct, xany); }
	public void setXany(ByteBuffer xany) { xanySet(struct, xany); }
	public void setXanyType(int type) { xanyType(struct, type); }
	public void setXanySerial(long serial) { xanySerial(struct, serial); }
	public void setXanySendEvent(int send_event) { xanySend_event(struct, send_event); }
	public void setXanyDisplay(long display) { xanyDisplay(struct, display); }
	public void setXanyWindow(long window) { xanyWindow(struct, window); }
	public void setXkey(long xkey) { xkeySet(struct, xkey); }
	public void setXkey(ByteBuffer xkey) { xkeySet(struct, xkey); }
	public void setXkeyType(int type) { xkeyType(struct, type); }
	public void setXkeySerial(long serial) { xkeySerial(struct, serial); }
	public void setXkeySendEvent(int send_event) { xkeySend_event(struct, send_event); }
	public void setXkeyDisplay(long display) { xkeyDisplay(struct, display); }
	public void setXkeyWindow(long window) { xkeyWindow(struct, window); }
	public void setXkeyRoot(long root) { xkeyRoot(struct, root); }
	public void setXkeySubwindow(long subwindow) { xkeySubwindow(struct, subwindow); }
	public void setXkeyTime(long time) { xkeyTime(struct, time); }
	public void setXkeyX(int x) { xkeyX(struct, x); }
	public void setXkeyY(int y) { xkeyY(struct, y); }
	public void setXkeyXRoot(int x_root) { xkeyX_root(struct, x_root); }
	public void setXkeyYRoot(int y_root) { xkeyY_root(struct, y_root); }
	public void setXkeyState(int state) { xkeyState(struct, state); }
	public void setXkeyKeycode(int keycode) { xkeyKeycode(struct, keycode); }
	public void setXkeySameScreen(int same_screen) { xkeySame_screen(struct, same_screen); }
	public void setXbutton(long xbutton) { xbuttonSet(struct, xbutton); }
	public void setXbutton(ByteBuffer xbutton) { xbuttonSet(struct, xbutton); }
	public void setXbuttonType(int type) { xbuttonType(struct, type); }
	public void setXbuttonSerial(long serial) { xbuttonSerial(struct, serial); }
	public void setXbuttonSendEvent(int send_event) { xbuttonSend_event(struct, send_event); }
	public void setXbuttonDisplay(long display) { xbuttonDisplay(struct, display); }
	public void setXbuttonWindow(long window) { xbuttonWindow(struct, window); }
	public void setXbuttonRoot(long root) { xbuttonRoot(struct, root); }
	public void setXbuttonSubwindow(long subwindow) { xbuttonSubwindow(struct, subwindow); }
	public void setXbuttonTime(long time) { xbuttonTime(struct, time); }
	public void setXbuttonX(int x) { xbuttonX(struct, x); }
	public void setXbuttonY(int y) { xbuttonY(struct, y); }
	public void setXbuttonXRoot(int x_root) { xbuttonX_root(struct, x_root); }
	public void setXbuttonYRoot(int y_root) { xbuttonY_root(struct, y_root); }
	public void setXbuttonState(int state) { xbuttonState(struct, state); }
	public void setXbuttonButton(int button) { xbuttonButton(struct, button); }
	public void setXbuttonSameScreen(int same_screen) { xbuttonSame_screen(struct, same_screen); }
	public void setXmotion(long xmotion) { xmotionSet(struct, xmotion); }
	public void setXmotion(ByteBuffer xmotion) { xmotionSet(struct, xmotion); }
	public void setXmotionType(int type) { xmotionType(struct, type); }
	public void setXmotionSerial(long serial) { xmotionSerial(struct, serial); }
	public void setXmotionSendEvent(int send_event) { xmotionSend_event(struct, send_event); }
	public void setXmotionDisplay(long display) { xmotionDisplay(struct, display); }
	public void setXmotionWindow(long window) { xmotionWindow(struct, window); }
	public void setXmotionRoot(long root) { xmotionRoot(struct, root); }
	public void setXmotionSubwindow(long subwindow) { xmotionSubwindow(struct, subwindow); }
	public void setXmotionTime(long time) { xmotionTime(struct, time); }
	public void setXmotionX(int x) { xmotionX(struct, x); }
	public void setXmotionY(int y) { xmotionY(struct, y); }
	public void setXmotionXRoot(int x_root) { xmotionX_root(struct, x_root); }
	public void setXmotionYRoot(int y_root) { xmotionY_root(struct, y_root); }
	public void setXmotionState(int state) { xmotionState(struct, state); }
	public void setXmotionIsHint(int is_hint) { xmotionIs_hint(struct, is_hint); }
	public void setXmotionSameScreen(int same_screen) { xmotionSame_screen(struct, same_screen); }
	public void setXconfigure(long xconfigure) { xconfigureSet(struct, xconfigure); }
	public void setXconfigure(ByteBuffer xconfigure) { xconfigureSet(struct, xconfigure); }
	public void setXconfigureType(int type) { xconfigureType(struct, type); }
	public void setXconfigureSerial(long serial) { xconfigureSerial(struct, serial); }
	public void setXconfigureSendEvent(int send_event) { xconfigureSend_event(struct, send_event); }
	public void setXconfigureDisplay(long display) { xconfigureDisplay(struct, display); }
	public void setXconfigureEvent(long event) { xconfigureEvent(struct, event); }
	public void setXconfigureWindow(long window) { xconfigureWindow(struct, window); }
	public void setXconfigureX(int x) { xconfigureX(struct, x); }
	public void setXconfigureY(int y) { xconfigureY(struct, y); }
	public void setXconfigureWidth(int width) { xconfigureWidth(struct, width); }
	public void setXconfigureHeight(int height) { xconfigureHeight(struct, height); }
	public void setXconfigureBorderWidth(int border_width) { xconfigureBorder_width(struct, border_width); }
	public void setXconfigureAbove(long above) { xconfigureAbove(struct, above); }
	public void setXconfigureOverrideRedirect(int override_redirect) { xconfigureOverride_redirect(struct, override_redirect); }
	public void setXproperty(long xproperty) { xpropertySet(struct, xproperty); }
	public void setXproperty(ByteBuffer xproperty) { xpropertySet(struct, xproperty); }
	public void setXpropertyType(int type) { xpropertyType(struct, type); }
	public void setXpropertySerial(long serial) { xpropertySerial(struct, serial); }
	public void setXpropertySendEvent(int send_event) { xpropertySend_event(struct, send_event); }
	public void setXpropertyDisplay(long display) { xpropertyDisplay(struct, display); }
	public void setXpropertyWindow(long window) { xpropertyWindow(struct, window); }
	public void setXpropertyAtom(long atom) { xpropertyAtom(struct, atom); }
	public void setXpropertyTime(long time) { xpropertyTime(struct, time); }
	public void setXpropertyState(int state) { xpropertyState(struct, state); }
	public void setXselectionrequest(long xselectionrequest) { xselectionrequestSet(struct, xselectionrequest); }
	public void setXselectionrequest(ByteBuffer xselectionrequest) { xselectionrequestSet(struct, xselectionrequest); }
	public void setXselectionrequestType(int type) { xselectionrequestType(struct, type); }
	public void setXselectionrequestSerial(long serial) { xselectionrequestSerial(struct, serial); }
	public void setXselectionrequestSendEvent(int send_event) { xselectionrequestSend_event(struct, send_event); }
	public void setXselectionrequestDisplay(long display) { xselectionrequestDisplay(struct, display); }
	public void setXselectionrequestOwner(long owner) { xselectionrequestOwner(struct, owner); }
	public void setXselectionrequestRequestor(long requestor) { xselectionrequestRequestor(struct, requestor); }
	public void setXselectionrequestSelection(long selection) { xselectionrequestSelection(struct, selection); }
	public void setXselectionrequestTarget(long target) { xselectionrequestTarget(struct, target); }
	public void setXselectionrequestProperty(long property) { xselectionrequestProperty(struct, property); }
	public void setXselectionrequestTime(long time) { xselectionrequestTime(struct, time); }
	public void setXselection(long xselection) { xselectionSet(struct, xselection); }
	public void setXselection(ByteBuffer xselection) { xselectionSet(struct, xselection); }
	public void setXselectionType(int type) { xselectionType(struct, type); }
	public void setXselectionSerial(long serial) { xselectionSerial(struct, serial); }
	public void setXselectionSendEvent(int send_event) { xselectionSend_event(struct, send_event); }
	public void setXselectionDisplay(long display) { xselectionDisplay(struct, display); }
	public void setXselectionRequestor(long requestor) { xselectionRequestor(struct, requestor); }
	public void setXselectionSelection(long selection) { xselectionSelection(struct, selection); }
	public void setXselectionTarget(long target) { xselectionTarget(struct, target); }
	public void setXselectionProperty(long property) { xselectionProperty(struct, property); }
	public void setXselectionTime(long time) { xselectionTime(struct, time); }
	public void setXclient(long xclient) { xclientSet(struct, xclient); }
	public void setXclient(ByteBuffer xclient) { xclientSet(struct, xclient); }
	public void setXclientType(int type) { xclientType(struct, type); }
	public void setXclientSerial(long serial) { xclientSerial(struct, serial); }
	public void setXclientSendEvent(int send_event) { xclientSend_event(struct, send_event); }
	public void setXclientDisplay(long display) { xclientDisplay(struct, display); }
	public void setXclientWindow(long window) { xclientWindow(struct, window); }
	public void setXclientMessageType(long message_type) { xclientMessage_type(struct, message_type); }
	public void setXclientFormat(int format) { xclientFormat(struct, format); }
	public void setXclientDataB(long b, int bytes) { xclientDataBSet(struct, b, bytes); }
	public void setXclientDataB(ByteBuffer b) { xclientDataBSet(struct, b); }
	public void setXclientDataS(long s, int bytes) { xclientDataSSet(struct, s, bytes); }
	public void setXclientDataS(ByteBuffer s) { xclientDataSSet(struct, s); }
	public void setXclientDataL(long l, int bytes) { xclientDataLSet(struct, l, bytes); }
	public void setXclientDataL(ByteBuffer l) { xclientDataLSet(struct, l); }
	public void setXerror(long xerror) { xerrorSet(struct, xerror); }
	public void setXerror(ByteBuffer xerror) { xerrorSet(struct, xerror); }
	public void setXerrorType(int type) { xerrorType(struct, type); }
	public void setXerrorDisplay(long display) { xerrorDisplay(struct, display); }
	public void setXerrorSerial(long serial) { xerrorSerial(struct, serial); }
	public void setXerrorErrorCode(int error_code) { xerrorError_code(struct, error_code); }
	public void setXerrorRequestCode(int request_code) { xerrorRequest_code(struct, request_code); }
	public void setXerrorMinorCode(int minor_code) { xerrorMinor_code(struct, minor_code); }
	public void setXerrorResourceid(long resourceid) { xerrorResourceid(struct, resourceid); }
	public void setXcookie(long xcookie) { xcookieSet(struct, xcookie); }
	public void setXcookie(ByteBuffer xcookie) { xcookieSet(struct, xcookie); }
	public void setXcookieType(int type) { xcookieType(struct, type); }
	public void setXcookieSerial(long serial) { xcookieSerial(struct, serial); }
	public void setXcookieSendEvent(int send_event) { xcookieSend_event(struct, send_event); }
	public void setXcookieDisplay(long display) { xcookieDisplay(struct, display); }
	public void setXcookieExtension(int extension) { xcookieExtension(struct, extension); }
	public void setXcookieEvtype(int evtype) { xcookieEvtype(struct, evtype); }
	public void setXcookieCookie(int cookie) { xcookieCookie(struct, cookie); }
	public void setXcookieData(long data) { xcookieData(struct, data); }
	public void setXcookieData(ByteBuffer data) { xcookieData(struct, data); }
	public void setPad(long pad, int bytes) { padSet(struct, pad, bytes); }
	public void setPad(ByteBuffer pad) { padSet(struct, pad); }

	public int getType() { return type(struct); }
	public void getXany(long xany) { xanyGet(struct, xany); }
	public void getXany(ByteBuffer xany) { xanyGet(struct, xany); }
	public int getXanyType() { return xanyType(struct); }
	public long getXanySerial() { return xanySerial(struct); }
	public int getXanySendEvent() { return xanySend_event(struct); }
	public long getXanyDisplay() { return xanyDisplay(struct); }
	public long getXanyWindow() { return xanyWindow(struct); }
	public void getXkey(long xkey) { xkeyGet(struct, xkey); }
	public void getXkey(ByteBuffer xkey) { xkeyGet(struct, xkey); }
	public int getXkeyType() { return xkeyType(struct); }
	public long getXkeySerial() { return xkeySerial(struct); }
	public int getXkeySendEvent() { return xkeySend_event(struct); }
	public long getXkeyDisplay() { return xkeyDisplay(struct); }
	public long getXkeyWindow() { return xkeyWindow(struct); }
	public long getXkeyRoot() { return xkeyRoot(struct); }
	public long getXkeySubwindow() { return xkeySubwindow(struct); }
	public long getXkeyTime() { return xkeyTime(struct); }
	public int getXkeyX() { return xkeyX(struct); }
	public int getXkeyY() { return xkeyY(struct); }
	public int getXkeyXRoot() { return xkeyX_root(struct); }
	public int getXkeyYRoot() { return xkeyY_root(struct); }
	public int getXkeyState() { return xkeyState(struct); }
	public int getXkeyKeycode() { return xkeyKeycode(struct); }
	public int getXkeySameScreen() { return xkeySame_screen(struct); }
	public void getXbutton(long xbutton) { xbuttonGet(struct, xbutton); }
	public void getXbutton(ByteBuffer xbutton) { xbuttonGet(struct, xbutton); }
	public int getXbuttonType() { return xbuttonType(struct); }
	public long getXbuttonSerial() { return xbuttonSerial(struct); }
	public int getXbuttonSendEvent() { return xbuttonSend_event(struct); }
	public long getXbuttonDisplay() { return xbuttonDisplay(struct); }
	public long getXbuttonWindow() { return xbuttonWindow(struct); }
	public long getXbuttonRoot() { return xbuttonRoot(struct); }
	public long getXbuttonSubwindow() { return xbuttonSubwindow(struct); }
	public long getXbuttonTime() { return xbuttonTime(struct); }
	public int getXbuttonX() { return xbuttonX(struct); }
	public int getXbuttonY() { return xbuttonY(struct); }
	public int getXbuttonXRoot() { return xbuttonX_root(struct); }
	public int getXbuttonYRoot() { return xbuttonY_root(struct); }
	public int getXbuttonState() { return xbuttonState(struct); }
	public int getXbuttonButton() { return xbuttonButton(struct); }
	public int getXbuttonSameScreen() { return xbuttonSame_screen(struct); }
	public void getXmotion(long xmotion) { xmotionGet(struct, xmotion); }
	public void getXmotion(ByteBuffer xmotion) { xmotionGet(struct, xmotion); }
	public int getXmotionType() { return xmotionType(struct); }
	public long getXmotionSerial() { return xmotionSerial(struct); }
	public int getXmotionSendEvent() { return xmotionSend_event(struct); }
	public long getXmotionDisplay() { return xmotionDisplay(struct); }
	public long getXmotionWindow() { return xmotionWindow(struct); }
	public long getXmotionRoot() { return xmotionRoot(struct); }
	public long getXmotionSubwindow() { return xmotionSubwindow(struct); }
	public long getXmotionTime() { return xmotionTime(struct); }
	public int getXmotionX() { return xmotionX(struct); }
	public int getXmotionY() { return xmotionY(struct); }
	public int getXmotionXRoot() { return xmotionX_root(struct); }
	public int getXmotionYRoot() { return xmotionY_root(struct); }
	public int getXmotionState() { return xmotionState(struct); }
	public int getXmotionIsHint() { return xmotionIs_hint(struct); }
	public int getXmotionSameScreen() { return xmotionSame_screen(struct); }
	public void getXconfigure(long xconfigure) { xconfigureGet(struct, xconfigure); }
	public void getXconfigure(ByteBuffer xconfigure) { xconfigureGet(struct, xconfigure); }
	public int getXconfigureType() { return xconfigureType(struct); }
	public long getXconfigureSerial() { return xconfigureSerial(struct); }
	public int getXconfigureSendEvent() { return xconfigureSend_event(struct); }
	public long getXconfigureDisplay() { return xconfigureDisplay(struct); }
	public long getXconfigureEvent() { return xconfigureEvent(struct); }
	public long getXconfigureWindow() { return xconfigureWindow(struct); }
	public int getXconfigureX() { return xconfigureX(struct); }
	public int getXconfigureY() { return xconfigureY(struct); }
	public int getXconfigureWidth() { return xconfigureWidth(struct); }
	public int getXconfigureHeight() { return xconfigureHeight(struct); }
	public int getXconfigureBorderWidth() { return xconfigureBorder_width(struct); }
	public long getXconfigureAbove() { return xconfigureAbove(struct); }
	public int getXconfigureOverrideRedirect() { return xconfigureOverride_redirect(struct); }
	public void getXproperty(long xproperty) { xpropertyGet(struct, xproperty); }
	public void getXproperty(ByteBuffer xproperty) { xpropertyGet(struct, xproperty); }
	public int getXpropertyType() { return xpropertyType(struct); }
	public long getXpropertySerial() { return xpropertySerial(struct); }
	public int getXpropertySendEvent() { return xpropertySend_event(struct); }
	public long getXpropertyDisplay() { return xpropertyDisplay(struct); }
	public long getXpropertyWindow() { return xpropertyWindow(struct); }
	public long getXpropertyAtom() { return xpropertyAtom(struct); }
	public long getXpropertyTime() { return xpropertyTime(struct); }
	public int getXpropertyState() { return xpropertyState(struct); }
	public void getXselectionrequest(long xselectionrequest) { xselectionrequestGet(struct, xselectionrequest); }
	public void getXselectionrequest(ByteBuffer xselectionrequest) { xselectionrequestGet(struct, xselectionrequest); }
	public int getXselectionrequestType() { return xselectionrequestType(struct); }
	public long getXselectionrequestSerial() { return xselectionrequestSerial(struct); }
	public int getXselectionrequestSendEvent() { return xselectionrequestSend_event(struct); }
	public long getXselectionrequestDisplay() { return xselectionrequestDisplay(struct); }
	public long getXselectionrequestOwner() { return xselectionrequestOwner(struct); }
	public long getXselectionrequestRequestor() { return xselectionrequestRequestor(struct); }
	public long getXselectionrequestSelection() { return xselectionrequestSelection(struct); }
	public long getXselectionrequestTarget() { return xselectionrequestTarget(struct); }
	public long getXselectionrequestProperty() { return xselectionrequestProperty(struct); }
	public long getXselectionrequestTime() { return xselectionrequestTime(struct); }
	public void getXselection(long xselection) { xselectionGet(struct, xselection); }
	public void getXselection(ByteBuffer xselection) { xselectionGet(struct, xselection); }
	public int getXselectionType() { return xselectionType(struct); }
	public long getXselectionSerial() { return xselectionSerial(struct); }
	public int getXselectionSendEvent() { return xselectionSend_event(struct); }
	public long getXselectionDisplay() { return xselectionDisplay(struct); }
	public long getXselectionRequestor() { return xselectionRequestor(struct); }
	public long getXselectionSelection() { return xselectionSelection(struct); }
	public long getXselectionTarget() { return xselectionTarget(struct); }
	public long getXselectionProperty() { return xselectionProperty(struct); }
	public long getXselectionTime() { return xselectionTime(struct); }
	public void getXclient(long xclient) { xclientGet(struct, xclient); }
	public void getXclient(ByteBuffer xclient) { xclientGet(struct, xclient); }
	public int getXclientType() { return xclientType(struct); }
	public long getXclientSerial() { return xclientSerial(struct); }
	public int getXclientSendEvent() { return xclientSend_event(struct); }
	public long getXclientDisplay() { return xclientDisplay(struct); }
	public long getXclientWindow() { return xclientWindow(struct); }
	public long getXclientMessageType() { return xclientMessage_type(struct); }
	public int getXclientFormat() { return xclientFormat(struct); }
	public void getXclientDataB(long b, int bytes) { xclientDataBGet(struct, b, bytes); }
	public void getXclientDataB(ByteBuffer b) { xclientDataBGet(struct, b); }
	public void getXclientDataS(long s, int bytes) { xclientDataSGet(struct, s, bytes); }
	public void getXclientDataS(ByteBuffer s) { xclientDataSGet(struct, s); }
	public void getXclientDataL(long l, int bytes) { xclientDataLGet(struct, l, bytes); }
	public void getXclientDataL(ByteBuffer l) { xclientDataLGet(struct, l); }
	public void getXerror(long xerror) { xerrorGet(struct, xerror); }
	public void getXerror(ByteBuffer xerror) { xerrorGet(struct, xerror); }
	public int getXerrorType() { return xerrorType(struct); }
	public long getXerrorDisplay() { return xerrorDisplay(struct); }
	public long getXerrorSerial() { return xerrorSerial(struct); }
	public int getXerrorErrorCode() { return xerrorError_code(struct); }
	public int getXerrorRequestCode() { return xerrorRequest_code(struct); }
	public int getXerrorMinorCode() { return xerrorMinor_code(struct); }
	public long getXerrorResourceid() { return xerrorResourceid(struct); }
	public void getXcookie(long xcookie) { xcookieGet(struct, xcookie); }
	public void getXcookie(ByteBuffer xcookie) { xcookieGet(struct, xcookie); }
	public int getXcookieType() { return xcookieType(struct); }
	public long getXcookieSerial() { return xcookieSerial(struct); }
	public int getXcookieSendEvent() { return xcookieSend_event(struct); }
	public long getXcookieDisplay() { return xcookieDisplay(struct); }
	public int getXcookieExtension() { return xcookieExtension(struct); }
	public int getXcookieEvtype() { return xcookieEvtype(struct); }
	public int getXcookieCookie() { return xcookieCookie(struct); }
	public long getXcookieData() { return xcookieData(struct); }
	public ByteBuffer getXcookieData(int size) { return xcookieData(struct, size); }
	public void getPad(long pad, int bytes) { padGet(struct, pad, bytes); }
	public void getPad(ByteBuffer pad) { padGet(struct, pad); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int type,
		long xany,
		long xkey,
		long xbutton,
		long xmotion,
		long xconfigure,
		long xproperty,
		long xselectionrequest,
		long xselection,
		long xclient,
		long xerror,
		long xcookie,
		long pad,
		int padBytes
	) {
		ByteBuffer xevent = malloc();

		type(xevent, type);
		xanySet(xevent, xany);
		xkeySet(xevent, xkey);
		xbuttonSet(xevent, xbutton);
		xmotionSet(xevent, xmotion);
		xconfigureSet(xevent, xconfigure);
		xpropertySet(xevent, xproperty);
		xselectionrequestSet(xevent, xselectionrequest);
		xselectionSet(xevent, xselection);
		xclientSet(xevent, xclient);
		xerrorSet(xevent, xerror);
		xcookieSet(xevent, xcookie);
		padSet(xevent, pad, padBytes);

		return xevent;
	}

	/** Alternative virtual constructor. */
	public static ByteBuffer malloc(
		int type,
		ByteBuffer xany,
		ByteBuffer xkey,
		ByteBuffer xbutton,
		ByteBuffer xmotion,
		ByteBuffer xconfigure,
		ByteBuffer xproperty,
		ByteBuffer xselectionrequest,
		ByteBuffer xselection,
		ByteBuffer xclient,
		ByteBuffer xerror,
		ByteBuffer xcookie,
		ByteBuffer pad
	) {
		ByteBuffer xevent = malloc();

		type(xevent, type);
		xanySet(xevent, xany);
		xkeySet(xevent, xkey);
		xbuttonSet(xevent, xbutton);
		xmotionSet(xevent, xmotion);
		xconfigureSet(xevent, xconfigure);
		xpropertySet(xevent, xproperty);
		xselectionrequestSet(xevent, xselectionrequest);
		xselectionSet(xevent, xselection);
		xclientSet(xevent, xclient);
		xerrorSet(xevent, xerror);
		xcookieSet(xevent, xcookie);
		padSet(xevent, pad);

		return xevent;
	}

	public static void type(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + TYPE, type); }
	public static void xanySet(ByteBuffer xevent, long xany) { if ( xany != NULL ) memCopy(xany, memAddress(xevent) + XANY, XAnyEvent.SIZEOF); }
	public static void xanySet(ByteBuffer xevent, ByteBuffer xany) { xanySet(xevent, memAddressSafe(xany)); }
	public static void xanyType(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XANY + XAnyEvent.TYPE, type); }
	public static void xanySerial(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XANY + XAnyEvent.SERIAL, serial); }
	public static void xanySend_event(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XANY + XAnyEvent.SEND_EVENT, send_event); }
	public static void xanyDisplay(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XANY + XAnyEvent.DISPLAY, display); }
	public static void xanyWindow(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XANY + XAnyEvent.WINDOW, window); }
	public static void xkeySet(ByteBuffer xevent, long xkey) { if ( xkey != NULL ) memCopy(xkey, memAddress(xevent) + XKEY, XKeyEvent.SIZEOF); }
	public static void xkeySet(ByteBuffer xevent, ByteBuffer xkey) { xkeySet(xevent, memAddressSafe(xkey)); }
	public static void xkeyType(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.TYPE, type); }
	public static void xkeySerial(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XKEY + XKeyEvent.SERIAL, serial); }
	public static void xkeySend_event(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.SEND_EVENT, send_event); }
	public static void xkeyDisplay(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XKEY + XKeyEvent.DISPLAY, display); }
	public static void xkeyWindow(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XKEY + XKeyEvent.WINDOW, window); }
	public static void xkeyRoot(ByteBuffer xevent, long root) { PointerBuffer.put(xevent, xevent.position() + XKEY + XKeyEvent.ROOT, root); }
	public static void xkeySubwindow(ByteBuffer xevent, long subwindow) { PointerBuffer.put(xevent, xevent.position() + XKEY + XKeyEvent.SUBWINDOW, subwindow); }
	public static void xkeyTime(ByteBuffer xevent, long time) { PointerBuffer.put(xevent, xevent.position() + XKEY + XKeyEvent.TIME, time); }
	public static void xkeyX(ByteBuffer xevent, int x) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.X, x); }
	public static void xkeyY(ByteBuffer xevent, int y) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.Y, y); }
	public static void xkeyX_root(ByteBuffer xevent, int x_root) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.X_ROOT, x_root); }
	public static void xkeyY_root(ByteBuffer xevent, int y_root) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.Y_ROOT, y_root); }
	public static void xkeyState(ByteBuffer xevent, int state) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.STATE, state); }
	public static void xkeyKeycode(ByteBuffer xevent, int keycode) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.KEYCODE, keycode); }
	public static void xkeySame_screen(ByteBuffer xevent, int same_screen) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.SAME_SCREEN, same_screen); }
	public static void xbuttonSet(ByteBuffer xevent, long xbutton) { if ( xbutton != NULL ) memCopy(xbutton, memAddress(xevent) + XBUTTON, XButtonEvent.SIZEOF); }
	public static void xbuttonSet(ByteBuffer xevent, ByteBuffer xbutton) { xbuttonSet(xevent, memAddressSafe(xbutton)); }
	public static void xbuttonType(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.TYPE, type); }
	public static void xbuttonSerial(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XBUTTON + XButtonEvent.SERIAL, serial); }
	public static void xbuttonSend_event(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.SEND_EVENT, send_event); }
	public static void xbuttonDisplay(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XBUTTON + XButtonEvent.DISPLAY, display); }
	public static void xbuttonWindow(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XBUTTON + XButtonEvent.WINDOW, window); }
	public static void xbuttonRoot(ByteBuffer xevent, long root) { PointerBuffer.put(xevent, xevent.position() + XBUTTON + XButtonEvent.ROOT, root); }
	public static void xbuttonSubwindow(ByteBuffer xevent, long subwindow) { PointerBuffer.put(xevent, xevent.position() + XBUTTON + XButtonEvent.SUBWINDOW, subwindow); }
	public static void xbuttonTime(ByteBuffer xevent, long time) { PointerBuffer.put(xevent, xevent.position() + XBUTTON + XButtonEvent.TIME, time); }
	public static void xbuttonX(ByteBuffer xevent, int x) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.X, x); }
	public static void xbuttonY(ByteBuffer xevent, int y) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.Y, y); }
	public static void xbuttonX_root(ByteBuffer xevent, int x_root) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.X_ROOT, x_root); }
	public static void xbuttonY_root(ByteBuffer xevent, int y_root) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.Y_ROOT, y_root); }
	public static void xbuttonState(ByteBuffer xevent, int state) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.STATE, state); }
	public static void xbuttonButton(ByteBuffer xevent, int button) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.BUTTON, button); }
	public static void xbuttonSame_screen(ByteBuffer xevent, int same_screen) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.SAME_SCREEN, same_screen); }
	public static void xmotionSet(ByteBuffer xevent, long xmotion) { if ( xmotion != NULL ) memCopy(xmotion, memAddress(xevent) + XMOTION, XMotionEvent.SIZEOF); }
	public static void xmotionSet(ByteBuffer xevent, ByteBuffer xmotion) { xmotionSet(xevent, memAddressSafe(xmotion)); }
	public static void xmotionType(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.TYPE, type); }
	public static void xmotionSerial(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XMOTION + XMotionEvent.SERIAL, serial); }
	public static void xmotionSend_event(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.SEND_EVENT, send_event); }
	public static void xmotionDisplay(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XMOTION + XMotionEvent.DISPLAY, display); }
	public static void xmotionWindow(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XMOTION + XMotionEvent.WINDOW, window); }
	public static void xmotionRoot(ByteBuffer xevent, long root) { PointerBuffer.put(xevent, xevent.position() + XMOTION + XMotionEvent.ROOT, root); }
	public static void xmotionSubwindow(ByteBuffer xevent, long subwindow) { PointerBuffer.put(xevent, xevent.position() + XMOTION + XMotionEvent.SUBWINDOW, subwindow); }
	public static void xmotionTime(ByteBuffer xevent, long time) { PointerBuffer.put(xevent, xevent.position() + XMOTION + XMotionEvent.TIME, time); }
	public static void xmotionX(ByteBuffer xevent, int x) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.X, x); }
	public static void xmotionY(ByteBuffer xevent, int y) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.Y, y); }
	public static void xmotionX_root(ByteBuffer xevent, int x_root) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.X_ROOT, x_root); }
	public static void xmotionY_root(ByteBuffer xevent, int y_root) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.Y_ROOT, y_root); }
	public static void xmotionState(ByteBuffer xevent, int state) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.STATE, state); }
	public static void xmotionIs_hint(ByteBuffer xevent, int is_hint) { xevent.put(xevent.position() + XMOTION + XMotionEvent.IS_HINT, (byte)is_hint); }
	public static void xmotionSame_screen(ByteBuffer xevent, int same_screen) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.SAME_SCREEN, same_screen); }
	public static void xconfigureSet(ByteBuffer xevent, long xconfigure) { if ( xconfigure != NULL ) memCopy(xconfigure, memAddress(xevent) + XCONFIGURE, XConfigureEvent.SIZEOF); }
	public static void xconfigureSet(ByteBuffer xevent, ByteBuffer xconfigure) { xconfigureSet(xevent, memAddressSafe(xconfigure)); }
	public static void xconfigureType(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.TYPE, type); }
	public static void xconfigureSerial(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.SERIAL, serial); }
	public static void xconfigureSend_event(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.SEND_EVENT, send_event); }
	public static void xconfigureDisplay(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.DISPLAY, display); }
	public static void xconfigureEvent(ByteBuffer xevent, long event) { PointerBuffer.put(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.EVENT, event); }
	public static void xconfigureWindow(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.WINDOW, window); }
	public static void xconfigureX(ByteBuffer xevent, int x) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.X, x); }
	public static void xconfigureY(ByteBuffer xevent, int y) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.Y, y); }
	public static void xconfigureWidth(ByteBuffer xevent, int width) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.WIDTH, width); }
	public static void xconfigureHeight(ByteBuffer xevent, int height) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.HEIGHT, height); }
	public static void xconfigureBorder_width(ByteBuffer xevent, int border_width) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.BORDER_WIDTH, border_width); }
	public static void xconfigureAbove(ByteBuffer xevent, long above) { PointerBuffer.put(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.ABOVE, above); }
	public static void xconfigureOverride_redirect(ByteBuffer xevent, int override_redirect) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.OVERRIDE_REDIRECT, override_redirect); }
	public static void xpropertySet(ByteBuffer xevent, long xproperty) { if ( xproperty != NULL ) memCopy(xproperty, memAddress(xevent) + XPROPERTY, XPropertyEvent.SIZEOF); }
	public static void xpropertySet(ByteBuffer xevent, ByteBuffer xproperty) { xpropertySet(xevent, memAddressSafe(xproperty)); }
	public static void xpropertyType(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XPROPERTY + XPropertyEvent.TYPE, type); }
	public static void xpropertySerial(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XPROPERTY + XPropertyEvent.SERIAL, serial); }
	public static void xpropertySend_event(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XPROPERTY + XPropertyEvent.SEND_EVENT, send_event); }
	public static void xpropertyDisplay(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XPROPERTY + XPropertyEvent.DISPLAY, display); }
	public static void xpropertyWindow(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XPROPERTY + XPropertyEvent.WINDOW, window); }
	public static void xpropertyAtom(ByteBuffer xevent, long atom) { PointerBuffer.put(xevent, xevent.position() + XPROPERTY + XPropertyEvent.ATOM, atom); }
	public static void xpropertyTime(ByteBuffer xevent, long time) { PointerBuffer.put(xevent, xevent.position() + XPROPERTY + XPropertyEvent.TIME, time); }
	public static void xpropertyState(ByteBuffer xevent, int state) { xevent.putInt(xevent.position() + XPROPERTY + XPropertyEvent.STATE, state); }
	public static void xselectionrequestSet(ByteBuffer xevent, long xselectionrequest) { if ( xselectionrequest != NULL ) memCopy(xselectionrequest, memAddress(xevent) + XSELECTIONREQUEST, XSelectionRequestEvent.SIZEOF); }
	public static void xselectionrequestSet(ByteBuffer xevent, ByteBuffer xselectionrequest) { xselectionrequestSet(xevent, memAddressSafe(xselectionrequest)); }
	public static void xselectionrequestType(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.TYPE, type); }
	public static void xselectionrequestSerial(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.SERIAL, serial); }
	public static void xselectionrequestSend_event(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.SEND_EVENT, send_event); }
	public static void xselectionrequestDisplay(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.DISPLAY, display); }
	public static void xselectionrequestOwner(ByteBuffer xevent, long owner) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.OWNER, owner); }
	public static void xselectionrequestRequestor(ByteBuffer xevent, long requestor) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.REQUESTOR, requestor); }
	public static void xselectionrequestSelection(ByteBuffer xevent, long selection) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.SELECTION, selection); }
	public static void xselectionrequestTarget(ByteBuffer xevent, long target) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.TARGET, target); }
	public static void xselectionrequestProperty(ByteBuffer xevent, long property) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.PROPERTY, property); }
	public static void xselectionrequestTime(ByteBuffer xevent, long time) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.TIME, time); }
	public static void xselectionSet(ByteBuffer xevent, long xselection) { if ( xselection != NULL ) memCopy(xselection, memAddress(xevent) + XSELECTION, XSelectionEvent.SIZEOF); }
	public static void xselectionSet(ByteBuffer xevent, ByteBuffer xselection) { xselectionSet(xevent, memAddressSafe(xselection)); }
	public static void xselectionType(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XSELECTION + XSelectionEvent.TYPE, type); }
	public static void xselectionSerial(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XSELECTION + XSelectionEvent.SERIAL, serial); }
	public static void xselectionSend_event(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XSELECTION + XSelectionEvent.SEND_EVENT, send_event); }
	public static void xselectionDisplay(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XSELECTION + XSelectionEvent.DISPLAY, display); }
	public static void xselectionRequestor(ByteBuffer xevent, long requestor) { PointerBuffer.put(xevent, xevent.position() + XSELECTION + XSelectionEvent.REQUESTOR, requestor); }
	public static void xselectionSelection(ByteBuffer xevent, long selection) { PointerBuffer.put(xevent, xevent.position() + XSELECTION + XSelectionEvent.SELECTION, selection); }
	public static void xselectionTarget(ByteBuffer xevent, long target) { PointerBuffer.put(xevent, xevent.position() + XSELECTION + XSelectionEvent.TARGET, target); }
	public static void xselectionProperty(ByteBuffer xevent, long property) { PointerBuffer.put(xevent, xevent.position() + XSELECTION + XSelectionEvent.PROPERTY, property); }
	public static void xselectionTime(ByteBuffer xevent, long time) { PointerBuffer.put(xevent, xevent.position() + XSELECTION + XSelectionEvent.TIME, time); }
	public static void xclientSet(ByteBuffer xevent, long xclient) { if ( xclient != NULL ) memCopy(xclient, memAddress(xevent) + XCLIENT, XClientMessageEvent.SIZEOF); }
	public static void xclientSet(ByteBuffer xevent, ByteBuffer xclient) { xclientSet(xevent, memAddressSafe(xclient)); }
	public static void xclientType(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XCLIENT + XClientMessageEvent.TYPE, type); }
	public static void xclientSerial(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XCLIENT + XClientMessageEvent.SERIAL, serial); }
	public static void xclientSend_event(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XCLIENT + XClientMessageEvent.SEND_EVENT, send_event); }
	public static void xclientDisplay(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XCLIENT + XClientMessageEvent.DISPLAY, display); }
	public static void xclientWindow(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XCLIENT + XClientMessageEvent.WINDOW, window); }
	public static void xclientMessage_type(ByteBuffer xevent, long message_type) { PointerBuffer.put(xevent, xevent.position() + XCLIENT + XClientMessageEvent.MESSAGE_TYPE, message_type); }
	public static void xclientFormat(ByteBuffer xevent, int format) { xevent.putInt(xevent.position() + XCLIENT + XClientMessageEvent.FORMAT, format); }
	public static void xclientDataBSet(ByteBuffer xevent, long b, int bytes) { memCopy(b, memAddress(xevent) + XCLIENT + XClientMessageEvent.DATA_B, bytes); }
	public static void xclientDataBSet(ByteBuffer xevent, ByteBuffer b) {
		checkBufferGT(b, 20 * 1);
		xclientDataBSet(xevent, memAddress(b), b.remaining());
	}
	public static void xclientDataSSet(ByteBuffer xevent, long s, int bytes) { memCopy(s, memAddress(xevent) + XCLIENT + XClientMessageEvent.DATA_S, bytes); }
	public static void xclientDataSSet(ByteBuffer xevent, ByteBuffer s) {
		checkBufferGT(s, 10 * 2);
		xclientDataSSet(xevent, memAddress(s), s.remaining());
	}
	public static void xclientDataLSet(ByteBuffer xevent, long l, int bytes) { memCopy(l, memAddress(xevent) + XCLIENT + XClientMessageEvent.DATA_L, bytes); }
	public static void xclientDataLSet(ByteBuffer xevent, ByteBuffer l) {
		checkBufferGT(l, 5 * 8);
		xclientDataLSet(xevent, memAddress(l), l.remaining());
	}
	public static void xerrorSet(ByteBuffer xevent, long xerror) { if ( xerror != NULL ) memCopy(xerror, memAddress(xevent) + XERROR, XErrorEvent.SIZEOF); }
	public static void xerrorSet(ByteBuffer xevent, ByteBuffer xerror) { xerrorSet(xevent, memAddressSafe(xerror)); }
	public static void xerrorType(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XERROR + XErrorEvent.TYPE, type); }
	public static void xerrorDisplay(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XERROR + XErrorEvent.DISPLAY, display); }
	public static void xerrorSerial(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XERROR + XErrorEvent.SERIAL, serial); }
	public static void xerrorError_code(ByteBuffer xevent, int error_code) { xevent.put(xevent.position() + XERROR + XErrorEvent.ERROR_CODE, (byte)error_code); }
	public static void xerrorRequest_code(ByteBuffer xevent, int request_code) { xevent.put(xevent.position() + XERROR + XErrorEvent.REQUEST_CODE, (byte)request_code); }
	public static void xerrorMinor_code(ByteBuffer xevent, int minor_code) { xevent.put(xevent.position() + XERROR + XErrorEvent.MINOR_CODE, (byte)minor_code); }
	public static void xerrorResourceid(ByteBuffer xevent, long resourceid) { PointerBuffer.put(xevent, xevent.position() + XERROR + XErrorEvent.RESOURCEID, resourceid); }
	public static void xcookieSet(ByteBuffer xevent, long xcookie) { if ( xcookie != NULL ) memCopy(xcookie, memAddress(xevent) + XCOOKIE, XGenericEventCookie.SIZEOF); }
	public static void xcookieSet(ByteBuffer xevent, ByteBuffer xcookie) { xcookieSet(xevent, memAddressSafe(xcookie)); }
	public static void xcookieType(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XCOOKIE + XGenericEventCookie.TYPE, type); }
	public static void xcookieSerial(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XCOOKIE + XGenericEventCookie.SERIAL, serial); }
	public static void xcookieSend_event(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XCOOKIE + XGenericEventCookie.SEND_EVENT, send_event); }
	public static void xcookieDisplay(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XCOOKIE + XGenericEventCookie.DISPLAY, display); }
	public static void xcookieExtension(ByteBuffer xevent, int extension) { xevent.putInt(xevent.position() + XCOOKIE + XGenericEventCookie.EXTENSION, extension); }
	public static void xcookieEvtype(ByteBuffer xevent, int evtype) { xevent.putInt(xevent.position() + XCOOKIE + XGenericEventCookie.EVTYPE, evtype); }
	public static void xcookieCookie(ByteBuffer xevent, int cookie) { xevent.putInt(xevent.position() + XCOOKIE + XGenericEventCookie.COOKIE, cookie); }
	public static void xcookieData(ByteBuffer xevent, long data) { PointerBuffer.put(xevent, xevent.position() + XCOOKIE + XGenericEventCookie.DATA, data); }
	public static void xcookieData(ByteBuffer xevent, ByteBuffer data) { xcookieData(xevent, memAddress(data)); }
	public static void padSet(ByteBuffer xevent, long pad, int bytes) { memCopy(pad, memAddress(xevent) + PAD, bytes); }
	public static void padSet(ByteBuffer xevent, ByteBuffer pad) {
		checkBufferGT(pad, 24 * 8);
		padSet(xevent, memAddress(pad), pad.remaining());
	}

	public static int type(ByteBuffer xevent) { return xevent.getInt(xevent.position() + TYPE); }
	public static void xanyGet(ByteBuffer xevent, long xany) { memCopy(memAddress(xevent) + XANY, xany, XAnyEvent.SIZEOF); }
	public static void xanyGet(ByteBuffer xevent, ByteBuffer xany) { checkBuffer(xany, XAnyEvent.SIZEOF); xanyGet(xevent, memAddress(xany)); }
	public static int xanyType(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XANY + XAnyEvent.TYPE); }
	public static long xanySerial(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XANY + XAnyEvent.SERIAL); }
	public static int xanySend_event(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XANY + XAnyEvent.SEND_EVENT); }
	public static long xanyDisplay(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XANY + XAnyEvent.DISPLAY); }
	public static long xanyWindow(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XANY + XAnyEvent.WINDOW); }
	public static void xkeyGet(ByteBuffer xevent, long xkey) { memCopy(memAddress(xevent) + XKEY, xkey, XKeyEvent.SIZEOF); }
	public static void xkeyGet(ByteBuffer xevent, ByteBuffer xkey) { checkBuffer(xkey, XKeyEvent.SIZEOF); xkeyGet(xevent, memAddress(xkey)); }
	public static int xkeyType(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.TYPE); }
	public static long xkeySerial(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY + XKeyEvent.SERIAL); }
	public static int xkeySend_event(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.SEND_EVENT); }
	public static long xkeyDisplay(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY + XKeyEvent.DISPLAY); }
	public static long xkeyWindow(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY + XKeyEvent.WINDOW); }
	public static long xkeyRoot(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY + XKeyEvent.ROOT); }
	public static long xkeySubwindow(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY + XKeyEvent.SUBWINDOW); }
	public static long xkeyTime(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY + XKeyEvent.TIME); }
	public static int xkeyX(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.X); }
	public static int xkeyY(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.Y); }
	public static int xkeyX_root(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.X_ROOT); }
	public static int xkeyY_root(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.Y_ROOT); }
	public static int xkeyState(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.STATE); }
	public static int xkeyKeycode(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.KEYCODE); }
	public static int xkeySame_screen(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.SAME_SCREEN); }
	public static void xbuttonGet(ByteBuffer xevent, long xbutton) { memCopy(memAddress(xevent) + XBUTTON, xbutton, XButtonEvent.SIZEOF); }
	public static void xbuttonGet(ByteBuffer xevent, ByteBuffer xbutton) { checkBuffer(xbutton, XButtonEvent.SIZEOF); xbuttonGet(xevent, memAddress(xbutton)); }
	public static int xbuttonType(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.TYPE); }
	public static long xbuttonSerial(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XBUTTON + XButtonEvent.SERIAL); }
	public static int xbuttonSend_event(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.SEND_EVENT); }
	public static long xbuttonDisplay(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XBUTTON + XButtonEvent.DISPLAY); }
	public static long xbuttonWindow(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XBUTTON + XButtonEvent.WINDOW); }
	public static long xbuttonRoot(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XBUTTON + XButtonEvent.ROOT); }
	public static long xbuttonSubwindow(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XBUTTON + XButtonEvent.SUBWINDOW); }
	public static long xbuttonTime(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XBUTTON + XButtonEvent.TIME); }
	public static int xbuttonX(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.X); }
	public static int xbuttonY(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.Y); }
	public static int xbuttonX_root(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.X_ROOT); }
	public static int xbuttonY_root(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.Y_ROOT); }
	public static int xbuttonState(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.STATE); }
	public static int xbuttonButton(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.BUTTON); }
	public static int xbuttonSame_screen(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.SAME_SCREEN); }
	public static void xmotionGet(ByteBuffer xevent, long xmotion) { memCopy(memAddress(xevent) + XMOTION, xmotion, XMotionEvent.SIZEOF); }
	public static void xmotionGet(ByteBuffer xevent, ByteBuffer xmotion) { checkBuffer(xmotion, XMotionEvent.SIZEOF); xmotionGet(xevent, memAddress(xmotion)); }
	public static int xmotionType(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.TYPE); }
	public static long xmotionSerial(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XMOTION + XMotionEvent.SERIAL); }
	public static int xmotionSend_event(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.SEND_EVENT); }
	public static long xmotionDisplay(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XMOTION + XMotionEvent.DISPLAY); }
	public static long xmotionWindow(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XMOTION + XMotionEvent.WINDOW); }
	public static long xmotionRoot(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XMOTION + XMotionEvent.ROOT); }
	public static long xmotionSubwindow(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XMOTION + XMotionEvent.SUBWINDOW); }
	public static long xmotionTime(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XMOTION + XMotionEvent.TIME); }
	public static int xmotionX(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.X); }
	public static int xmotionY(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.Y); }
	public static int xmotionX_root(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.X_ROOT); }
	public static int xmotionY_root(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.Y_ROOT); }
	public static int xmotionState(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.STATE); }
	public static int xmotionIs_hint(ByteBuffer xevent) { return xevent.get(xevent.position() + XMOTION + XMotionEvent.IS_HINT); }
	public static int xmotionSame_screen(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.SAME_SCREEN); }
	public static void xconfigureGet(ByteBuffer xevent, long xconfigure) { memCopy(memAddress(xevent) + XCONFIGURE, xconfigure, XConfigureEvent.SIZEOF); }
	public static void xconfigureGet(ByteBuffer xevent, ByteBuffer xconfigure) { checkBuffer(xconfigure, XConfigureEvent.SIZEOF); xconfigureGet(xevent, memAddress(xconfigure)); }
	public static int xconfigureType(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.TYPE); }
	public static long xconfigureSerial(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.SERIAL); }
	public static int xconfigureSend_event(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.SEND_EVENT); }
	public static long xconfigureDisplay(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.DISPLAY); }
	public static long xconfigureEvent(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.EVENT); }
	public static long xconfigureWindow(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.WINDOW); }
	public static int xconfigureX(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.X); }
	public static int xconfigureY(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.Y); }
	public static int xconfigureWidth(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.WIDTH); }
	public static int xconfigureHeight(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.HEIGHT); }
	public static int xconfigureBorder_width(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.BORDER_WIDTH); }
	public static long xconfigureAbove(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.ABOVE); }
	public static int xconfigureOverride_redirect(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.OVERRIDE_REDIRECT); }
	public static void xpropertyGet(ByteBuffer xevent, long xproperty) { memCopy(memAddress(xevent) + XPROPERTY, xproperty, XPropertyEvent.SIZEOF); }
	public static void xpropertyGet(ByteBuffer xevent, ByteBuffer xproperty) { checkBuffer(xproperty, XPropertyEvent.SIZEOF); xpropertyGet(xevent, memAddress(xproperty)); }
	public static int xpropertyType(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XPROPERTY + XPropertyEvent.TYPE); }
	public static long xpropertySerial(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XPROPERTY + XPropertyEvent.SERIAL); }
	public static int xpropertySend_event(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XPROPERTY + XPropertyEvent.SEND_EVENT); }
	public static long xpropertyDisplay(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XPROPERTY + XPropertyEvent.DISPLAY); }
	public static long xpropertyWindow(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XPROPERTY + XPropertyEvent.WINDOW); }
	public static long xpropertyAtom(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XPROPERTY + XPropertyEvent.ATOM); }
	public static long xpropertyTime(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XPROPERTY + XPropertyEvent.TIME); }
	public static int xpropertyState(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XPROPERTY + XPropertyEvent.STATE); }
	public static void xselectionrequestGet(ByteBuffer xevent, long xselectionrequest) { memCopy(memAddress(xevent) + XSELECTIONREQUEST, xselectionrequest, XSelectionRequestEvent.SIZEOF); }
	public static void xselectionrequestGet(ByteBuffer xevent, ByteBuffer xselectionrequest) { checkBuffer(xselectionrequest, XSelectionRequestEvent.SIZEOF); xselectionrequestGet(xevent, memAddress(xselectionrequest)); }
	public static int xselectionrequestType(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.TYPE); }
	public static long xselectionrequestSerial(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.SERIAL); }
	public static int xselectionrequestSend_event(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.SEND_EVENT); }
	public static long xselectionrequestDisplay(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.DISPLAY); }
	public static long xselectionrequestOwner(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.OWNER); }
	public static long xselectionrequestRequestor(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.REQUESTOR); }
	public static long xselectionrequestSelection(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.SELECTION); }
	public static long xselectionrequestTarget(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.TARGET); }
	public static long xselectionrequestProperty(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.PROPERTY); }
	public static long xselectionrequestTime(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.TIME); }
	public static void xselectionGet(ByteBuffer xevent, long xselection) { memCopy(memAddress(xevent) + XSELECTION, xselection, XSelectionEvent.SIZEOF); }
	public static void xselectionGet(ByteBuffer xevent, ByteBuffer xselection) { checkBuffer(xselection, XSelectionEvent.SIZEOF); xselectionGet(xevent, memAddress(xselection)); }
	public static int xselectionType(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XSELECTION + XSelectionEvent.TYPE); }
	public static long xselectionSerial(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTION + XSelectionEvent.SERIAL); }
	public static int xselectionSend_event(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XSELECTION + XSelectionEvent.SEND_EVENT); }
	public static long xselectionDisplay(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTION + XSelectionEvent.DISPLAY); }
	public static long xselectionRequestor(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTION + XSelectionEvent.REQUESTOR); }
	public static long xselectionSelection(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTION + XSelectionEvent.SELECTION); }
	public static long xselectionTarget(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTION + XSelectionEvent.TARGET); }
	public static long xselectionProperty(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTION + XSelectionEvent.PROPERTY); }
	public static long xselectionTime(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTION + XSelectionEvent.TIME); }
	public static void xclientGet(ByteBuffer xevent, long xclient) { memCopy(memAddress(xevent) + XCLIENT, xclient, XClientMessageEvent.SIZEOF); }
	public static void xclientGet(ByteBuffer xevent, ByteBuffer xclient) { checkBuffer(xclient, XClientMessageEvent.SIZEOF); xclientGet(xevent, memAddress(xclient)); }
	public static int xclientType(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCLIENT + XClientMessageEvent.TYPE); }
	public static long xclientSerial(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCLIENT + XClientMessageEvent.SERIAL); }
	public static int xclientSend_event(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCLIENT + XClientMessageEvent.SEND_EVENT); }
	public static long xclientDisplay(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCLIENT + XClientMessageEvent.DISPLAY); }
	public static long xclientWindow(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCLIENT + XClientMessageEvent.WINDOW); }
	public static long xclientMessage_type(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCLIENT + XClientMessageEvent.MESSAGE_TYPE); }
	public static int xclientFormat(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCLIENT + XClientMessageEvent.FORMAT); }
	public static void xclientDataBGet(ByteBuffer xevent, long b, int bytes) {
		memCopy(memAddress(xevent) + XCLIENT + XClientMessageEvent.DATA_B, b, bytes);
	}
	public static void xclientDataBGet(ByteBuffer xevent, ByteBuffer b) {
		checkBufferGT(b, 20 * 1);
		xclientDataBGet(xevent, memAddress(b), b.remaining());
	}
	public static void xclientDataSGet(ByteBuffer xevent, long s, int bytes) {
		memCopy(memAddress(xevent) + XCLIENT + XClientMessageEvent.DATA_S, s, bytes);
	}
	public static void xclientDataSGet(ByteBuffer xevent, ByteBuffer s) {
		checkBufferGT(s, 10 * 2);
		xclientDataSGet(xevent, memAddress(s), s.remaining());
	}
	public static void xclientDataLGet(ByteBuffer xevent, long l, int bytes) {
		memCopy(memAddress(xevent) + XCLIENT + XClientMessageEvent.DATA_L, l, bytes);
	}
	public static void xclientDataLGet(ByteBuffer xevent, ByteBuffer l) {
		checkBufferGT(l, 5 * 8);
		xclientDataLGet(xevent, memAddress(l), l.remaining());
	}
	public static void xerrorGet(ByteBuffer xevent, long xerror) { memCopy(memAddress(xevent) + XERROR, xerror, XErrorEvent.SIZEOF); }
	public static void xerrorGet(ByteBuffer xevent, ByteBuffer xerror) { checkBuffer(xerror, XErrorEvent.SIZEOF); xerrorGet(xevent, memAddress(xerror)); }
	public static int xerrorType(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XERROR + XErrorEvent.TYPE); }
	public static long xerrorDisplay(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XERROR + XErrorEvent.DISPLAY); }
	public static long xerrorSerial(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XERROR + XErrorEvent.SERIAL); }
	public static int xerrorError_code(ByteBuffer xevent) { return xevent.get(xevent.position() + XERROR + XErrorEvent.ERROR_CODE) & 0xFF; }
	public static int xerrorRequest_code(ByteBuffer xevent) { return xevent.get(xevent.position() + XERROR + XErrorEvent.REQUEST_CODE) & 0xFF; }
	public static int xerrorMinor_code(ByteBuffer xevent) { return xevent.get(xevent.position() + XERROR + XErrorEvent.MINOR_CODE) & 0xFF; }
	public static long xerrorResourceid(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XERROR + XErrorEvent.RESOURCEID); }
	public static void xcookieGet(ByteBuffer xevent, long xcookie) { memCopy(memAddress(xevent) + XCOOKIE, xcookie, XGenericEventCookie.SIZEOF); }
	public static void xcookieGet(ByteBuffer xevent, ByteBuffer xcookie) { checkBuffer(xcookie, XGenericEventCookie.SIZEOF); xcookieGet(xevent, memAddress(xcookie)); }
	public static int xcookieType(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCOOKIE + XGenericEventCookie.TYPE); }
	public static long xcookieSerial(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCOOKIE + XGenericEventCookie.SERIAL); }
	public static int xcookieSend_event(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCOOKIE + XGenericEventCookie.SEND_EVENT); }
	public static long xcookieDisplay(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCOOKIE + XGenericEventCookie.DISPLAY); }
	public static int xcookieExtension(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCOOKIE + XGenericEventCookie.EXTENSION); }
	public static int xcookieEvtype(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCOOKIE + XGenericEventCookie.EVTYPE); }
	public static int xcookieCookie(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCOOKIE + XGenericEventCookie.COOKIE); }
	public static long xcookieData(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCOOKIE + XGenericEventCookie.DATA); }
	public static ByteBuffer xcookieData(ByteBuffer xevent, int size) { long address = xcookieData(xevent); return address == NULL ? null : memByteBuffer(address, size); }
	public static void padGet(ByteBuffer xevent, long pad, int bytes) {
		memCopy(memAddress(xevent) + PAD, pad, bytes);
	}
	public static void padGet(ByteBuffer xevent, ByteBuffer pad) {
		checkBufferGT(pad, 24 * 8);
		padGet(xevent, memAddress(pad), pad.remaining());
	}

}