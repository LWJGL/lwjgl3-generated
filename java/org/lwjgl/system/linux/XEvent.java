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
public final class XEvent {

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

	private XEvent() {}

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc()} and initializes the returned {@link ByteBuffer} instance with the given values. */
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

		typeSet(xevent, type);
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

		typeSet(xevent, type);
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

	public static void typeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + TYPE, type); }
	public static void xanySet(ByteBuffer xevent, long xany) { if ( xany != NULL ) memCopy(xany, memAddress(xevent) + XANY, XAnyEvent.SIZEOF); }
	public static void xanySet(ByteBuffer xevent, ByteBuffer xany) { xanySet(xevent, memAddressSafe(xany)); }
	public static void xanyTypeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XANY + XAnyEvent.TYPE, type); }
	public static void xanySerialSet(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XANY + XAnyEvent.SERIAL, serial); }
	public static void xanySend_eventSet(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XANY + XAnyEvent.SEND_EVENT, send_event); }
	public static void xanyDisplaySet(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XANY + XAnyEvent.DISPLAY, display); }
	public static void xanyWindowSet(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XANY + XAnyEvent.WINDOW, window); }
	public static void xkeySet(ByteBuffer xevent, long xkey) { if ( xkey != NULL ) memCopy(xkey, memAddress(xevent) + XKEY, XKeyEvent.SIZEOF); }
	public static void xkeySet(ByteBuffer xevent, ByteBuffer xkey) { xkeySet(xevent, memAddressSafe(xkey)); }
	public static void xkeyTypeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.TYPE, type); }
	public static void xkeySerialSet(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XKEY + XKeyEvent.SERIAL, serial); }
	public static void xkeySend_eventSet(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.SEND_EVENT, send_event); }
	public static void xkeyDisplaySet(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XKEY + XKeyEvent.DISPLAY, display); }
	public static void xkeyWindowSet(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XKEY + XKeyEvent.WINDOW, window); }
	public static void xkeyRootSet(ByteBuffer xevent, long root) { PointerBuffer.put(xevent, xevent.position() + XKEY + XKeyEvent.ROOT, root); }
	public static void xkeySubwindowSet(ByteBuffer xevent, long subwindow) { PointerBuffer.put(xevent, xevent.position() + XKEY + XKeyEvent.SUBWINDOW, subwindow); }
	public static void xkeyTimeSet(ByteBuffer xevent, long time) { PointerBuffer.put(xevent, xevent.position() + XKEY + XKeyEvent.TIME, time); }
	public static void xkeyXSet(ByteBuffer xevent, int x) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.X, x); }
	public static void xkeyYSet(ByteBuffer xevent, int y) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.Y, y); }
	public static void xkeyX_rootSet(ByteBuffer xevent, int x_root) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.X_ROOT, x_root); }
	public static void xkeyY_rootSet(ByteBuffer xevent, int y_root) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.Y_ROOT, y_root); }
	public static void xkeyStateSet(ByteBuffer xevent, int state) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.STATE, state); }
	public static void xkeyKeycodeSet(ByteBuffer xevent, int keycode) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.KEYCODE, keycode); }
	public static void xkeySame_screenSet(ByteBuffer xevent, int same_screen) { xevent.putInt(xevent.position() + XKEY + XKeyEvent.SAME_SCREEN, same_screen); }
	public static void xbuttonSet(ByteBuffer xevent, long xbutton) { if ( xbutton != NULL ) memCopy(xbutton, memAddress(xevent) + XBUTTON, XButtonEvent.SIZEOF); }
	public static void xbuttonSet(ByteBuffer xevent, ByteBuffer xbutton) { xbuttonSet(xevent, memAddressSafe(xbutton)); }
	public static void xbuttonTypeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.TYPE, type); }
	public static void xbuttonSerialSet(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XBUTTON + XButtonEvent.SERIAL, serial); }
	public static void xbuttonSend_eventSet(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.SEND_EVENT, send_event); }
	public static void xbuttonDisplaySet(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XBUTTON + XButtonEvent.DISPLAY, display); }
	public static void xbuttonWindowSet(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XBUTTON + XButtonEvent.WINDOW, window); }
	public static void xbuttonRootSet(ByteBuffer xevent, long root) { PointerBuffer.put(xevent, xevent.position() + XBUTTON + XButtonEvent.ROOT, root); }
	public static void xbuttonSubwindowSet(ByteBuffer xevent, long subwindow) { PointerBuffer.put(xevent, xevent.position() + XBUTTON + XButtonEvent.SUBWINDOW, subwindow); }
	public static void xbuttonTimeSet(ByteBuffer xevent, long time) { PointerBuffer.put(xevent, xevent.position() + XBUTTON + XButtonEvent.TIME, time); }
	public static void xbuttonXSet(ByteBuffer xevent, int x) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.X, x); }
	public static void xbuttonYSet(ByteBuffer xevent, int y) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.Y, y); }
	public static void xbuttonX_rootSet(ByteBuffer xevent, int x_root) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.X_ROOT, x_root); }
	public static void xbuttonY_rootSet(ByteBuffer xevent, int y_root) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.Y_ROOT, y_root); }
	public static void xbuttonStateSet(ByteBuffer xevent, int state) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.STATE, state); }
	public static void xbuttonButtonSet(ByteBuffer xevent, int button) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.BUTTON, button); }
	public static void xbuttonSame_screenSet(ByteBuffer xevent, int same_screen) { xevent.putInt(xevent.position() + XBUTTON + XButtonEvent.SAME_SCREEN, same_screen); }
	public static void xmotionSet(ByteBuffer xevent, long xmotion) { if ( xmotion != NULL ) memCopy(xmotion, memAddress(xevent) + XMOTION, XMotionEvent.SIZEOF); }
	public static void xmotionSet(ByteBuffer xevent, ByteBuffer xmotion) { xmotionSet(xevent, memAddressSafe(xmotion)); }
	public static void xmotionTypeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.TYPE, type); }
	public static void xmotionSerialSet(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XMOTION + XMotionEvent.SERIAL, serial); }
	public static void xmotionSend_eventSet(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.SEND_EVENT, send_event); }
	public static void xmotionDisplaySet(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XMOTION + XMotionEvent.DISPLAY, display); }
	public static void xmotionWindowSet(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XMOTION + XMotionEvent.WINDOW, window); }
	public static void xmotionRootSet(ByteBuffer xevent, long root) { PointerBuffer.put(xevent, xevent.position() + XMOTION + XMotionEvent.ROOT, root); }
	public static void xmotionSubwindowSet(ByteBuffer xevent, long subwindow) { PointerBuffer.put(xevent, xevent.position() + XMOTION + XMotionEvent.SUBWINDOW, subwindow); }
	public static void xmotionTimeSet(ByteBuffer xevent, long time) { PointerBuffer.put(xevent, xevent.position() + XMOTION + XMotionEvent.TIME, time); }
	public static void xmotionXSet(ByteBuffer xevent, int x) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.X, x); }
	public static void xmotionYSet(ByteBuffer xevent, int y) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.Y, y); }
	public static void xmotionX_rootSet(ByteBuffer xevent, int x_root) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.X_ROOT, x_root); }
	public static void xmotionY_rootSet(ByteBuffer xevent, int y_root) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.Y_ROOT, y_root); }
	public static void xmotionStateSet(ByteBuffer xevent, int state) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.STATE, state); }
	public static void xmotionIs_hintSet(ByteBuffer xevent, int is_hint) { xevent.put(xevent.position() + XMOTION + XMotionEvent.IS_HINT, (byte)is_hint); }
	public static void xmotionSame_screenSet(ByteBuffer xevent, int same_screen) { xevent.putInt(xevent.position() + XMOTION + XMotionEvent.SAME_SCREEN, same_screen); }
	public static void xconfigureSet(ByteBuffer xevent, long xconfigure) { if ( xconfigure != NULL ) memCopy(xconfigure, memAddress(xevent) + XCONFIGURE, XConfigureEvent.SIZEOF); }
	public static void xconfigureSet(ByteBuffer xevent, ByteBuffer xconfigure) { xconfigureSet(xevent, memAddressSafe(xconfigure)); }
	public static void xconfigureTypeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.TYPE, type); }
	public static void xconfigureSerialSet(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.SERIAL, serial); }
	public static void xconfigureSend_eventSet(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.SEND_EVENT, send_event); }
	public static void xconfigureDisplaySet(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.DISPLAY, display); }
	public static void xconfigureEventSet(ByteBuffer xevent, long event) { PointerBuffer.put(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.EVENT, event); }
	public static void xconfigureWindowSet(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.WINDOW, window); }
	public static void xconfigureXSet(ByteBuffer xevent, int x) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.X, x); }
	public static void xconfigureYSet(ByteBuffer xevent, int y) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.Y, y); }
	public static void xconfigureWidthSet(ByteBuffer xevent, int width) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.WIDTH, width); }
	public static void xconfigureHeightSet(ByteBuffer xevent, int height) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.HEIGHT, height); }
	public static void xconfigureBorder_widthSet(ByteBuffer xevent, int border_width) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.BORDER_WIDTH, border_width); }
	public static void xconfigureAboveSet(ByteBuffer xevent, long above) { PointerBuffer.put(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.ABOVE, above); }
	public static void xconfigureOverride_redirectSet(ByteBuffer xevent, int override_redirect) { xevent.putInt(xevent.position() + XCONFIGURE + XConfigureEvent.OVERRIDE_REDIRECT, override_redirect); }
	public static void xpropertySet(ByteBuffer xevent, long xproperty) { if ( xproperty != NULL ) memCopy(xproperty, memAddress(xevent) + XPROPERTY, XPropertyEvent.SIZEOF); }
	public static void xpropertySet(ByteBuffer xevent, ByteBuffer xproperty) { xpropertySet(xevent, memAddressSafe(xproperty)); }
	public static void xpropertyTypeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XPROPERTY + XPropertyEvent.TYPE, type); }
	public static void xpropertySerialSet(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XPROPERTY + XPropertyEvent.SERIAL, serial); }
	public static void xpropertySend_eventSet(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XPROPERTY + XPropertyEvent.SEND_EVENT, send_event); }
	public static void xpropertyDisplaySet(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XPROPERTY + XPropertyEvent.DISPLAY, display); }
	public static void xpropertyWindowSet(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XPROPERTY + XPropertyEvent.WINDOW, window); }
	public static void xpropertyAtomSet(ByteBuffer xevent, long atom) { PointerBuffer.put(xevent, xevent.position() + XPROPERTY + XPropertyEvent.ATOM, atom); }
	public static void xpropertyTimeSet(ByteBuffer xevent, long time) { PointerBuffer.put(xevent, xevent.position() + XPROPERTY + XPropertyEvent.TIME, time); }
	public static void xpropertyStateSet(ByteBuffer xevent, int state) { xevent.putInt(xevent.position() + XPROPERTY + XPropertyEvent.STATE, state); }
	public static void xselectionrequestSet(ByteBuffer xevent, long xselectionrequest) { if ( xselectionrequest != NULL ) memCopy(xselectionrequest, memAddress(xevent) + XSELECTIONREQUEST, XSelectionRequestEvent.SIZEOF); }
	public static void xselectionrequestSet(ByteBuffer xevent, ByteBuffer xselectionrequest) { xselectionrequestSet(xevent, memAddressSafe(xselectionrequest)); }
	public static void xselectionrequestTypeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.TYPE, type); }
	public static void xselectionrequestSerialSet(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.SERIAL, serial); }
	public static void xselectionrequestSend_eventSet(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.SEND_EVENT, send_event); }
	public static void xselectionrequestDisplaySet(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.DISPLAY, display); }
	public static void xselectionrequestOwnerSet(ByteBuffer xevent, long owner) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.OWNER, owner); }
	public static void xselectionrequestRequestorSet(ByteBuffer xevent, long requestor) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.REQUESTOR, requestor); }
	public static void xselectionrequestSelectionSet(ByteBuffer xevent, long selection) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.SELECTION, selection); }
	public static void xselectionrequestTargetSet(ByteBuffer xevent, long target) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.TARGET, target); }
	public static void xselectionrequestPropertySet(ByteBuffer xevent, long property) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.PROPERTY, property); }
	public static void xselectionrequestTimeSet(ByteBuffer xevent, long time) { PointerBuffer.put(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.TIME, time); }
	public static void xselectionSet(ByteBuffer xevent, long xselection) { if ( xselection != NULL ) memCopy(xselection, memAddress(xevent) + XSELECTION, XSelectionEvent.SIZEOF); }
	public static void xselectionSet(ByteBuffer xevent, ByteBuffer xselection) { xselectionSet(xevent, memAddressSafe(xselection)); }
	public static void xselectionTypeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XSELECTION + XSelectionEvent.TYPE, type); }
	public static void xselectionSerialSet(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XSELECTION + XSelectionEvent.SERIAL, serial); }
	public static void xselectionSend_eventSet(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XSELECTION + XSelectionEvent.SEND_EVENT, send_event); }
	public static void xselectionDisplaySet(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XSELECTION + XSelectionEvent.DISPLAY, display); }
	public static void xselectionRequestorSet(ByteBuffer xevent, long requestor) { PointerBuffer.put(xevent, xevent.position() + XSELECTION + XSelectionEvent.REQUESTOR, requestor); }
	public static void xselectionSelectionSet(ByteBuffer xevent, long selection) { PointerBuffer.put(xevent, xevent.position() + XSELECTION + XSelectionEvent.SELECTION, selection); }
	public static void xselectionTargetSet(ByteBuffer xevent, long target) { PointerBuffer.put(xevent, xevent.position() + XSELECTION + XSelectionEvent.TARGET, target); }
	public static void xselectionPropertySet(ByteBuffer xevent, long property) { PointerBuffer.put(xevent, xevent.position() + XSELECTION + XSelectionEvent.PROPERTY, property); }
	public static void xselectionTimeSet(ByteBuffer xevent, long time) { PointerBuffer.put(xevent, xevent.position() + XSELECTION + XSelectionEvent.TIME, time); }
	public static void xclientSet(ByteBuffer xevent, long xclient) { if ( xclient != NULL ) memCopy(xclient, memAddress(xevent) + XCLIENT, XClientMessageEvent.SIZEOF); }
	public static void xclientSet(ByteBuffer xevent, ByteBuffer xclient) { xclientSet(xevent, memAddressSafe(xclient)); }
	public static void xclientTypeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XCLIENT + XClientMessageEvent.TYPE, type); }
	public static void xclientSerialSet(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XCLIENT + XClientMessageEvent.SERIAL, serial); }
	public static void xclientSend_eventSet(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XCLIENT + XClientMessageEvent.SEND_EVENT, send_event); }
	public static void xclientDisplaySet(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XCLIENT + XClientMessageEvent.DISPLAY, display); }
	public static void xclientWindowSet(ByteBuffer xevent, long window) { PointerBuffer.put(xevent, xevent.position() + XCLIENT + XClientMessageEvent.WINDOW, window); }
	public static void xclientMessage_typeSet(ByteBuffer xevent, long message_type) { PointerBuffer.put(xevent, xevent.position() + XCLIENT + XClientMessageEvent.MESSAGE_TYPE, message_type); }
	public static void xclientFormatSet(ByteBuffer xevent, int format) { xevent.putInt(xevent.position() + XCLIENT + XClientMessageEvent.FORMAT, format); }
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
	public static void xerrorTypeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XERROR + XErrorEvent.TYPE, type); }
	public static void xerrorDisplaySet(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XERROR + XErrorEvent.DISPLAY, display); }
	public static void xerrorSerialSet(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XERROR + XErrorEvent.SERIAL, serial); }
	public static void xerrorError_codeSet(ByteBuffer xevent, int error_code) { xevent.put(xevent.position() + XERROR + XErrorEvent.ERROR_CODE, (byte)error_code); }
	public static void xerrorRequest_codeSet(ByteBuffer xevent, int request_code) { xevent.put(xevent.position() + XERROR + XErrorEvent.REQUEST_CODE, (byte)request_code); }
	public static void xerrorMinor_codeSet(ByteBuffer xevent, int minor_code) { xevent.put(xevent.position() + XERROR + XErrorEvent.MINOR_CODE, (byte)minor_code); }
	public static void xerrorResourceidSet(ByteBuffer xevent, long resourceid) { PointerBuffer.put(xevent, xevent.position() + XERROR + XErrorEvent.RESOURCEID, resourceid); }
	public static void xcookieSet(ByteBuffer xevent, long xcookie) { if ( xcookie != NULL ) memCopy(xcookie, memAddress(xevent) + XCOOKIE, XGenericEventCookie.SIZEOF); }
	public static void xcookieSet(ByteBuffer xevent, ByteBuffer xcookie) { xcookieSet(xevent, memAddressSafe(xcookie)); }
	public static void xcookieTypeSet(ByteBuffer xevent, int type) { xevent.putInt(xevent.position() + XCOOKIE + XGenericEventCookie.TYPE, type); }
	public static void xcookieSerialSet(ByteBuffer xevent, long serial) { PointerBuffer.put(xevent, xevent.position() + XCOOKIE + XGenericEventCookie.SERIAL, serial); }
	public static void xcookieSend_eventSet(ByteBuffer xevent, int send_event) { xevent.putInt(xevent.position() + XCOOKIE + XGenericEventCookie.SEND_EVENT, send_event); }
	public static void xcookieDisplaySet(ByteBuffer xevent, long display) { PointerBuffer.put(xevent, xevent.position() + XCOOKIE + XGenericEventCookie.DISPLAY, display); }
	public static void xcookieExtensionSet(ByteBuffer xevent, int extension) { xevent.putInt(xevent.position() + XCOOKIE + XGenericEventCookie.EXTENSION, extension); }
	public static void xcookieEvtypeSet(ByteBuffer xevent, int evtype) { xevent.putInt(xevent.position() + XCOOKIE + XGenericEventCookie.EVTYPE, evtype); }
	public static void xcookieCookieSet(ByteBuffer xevent, int cookie) { xevent.putInt(xevent.position() + XCOOKIE + XGenericEventCookie.COOKIE, cookie); }
	public static void xcookieDataSet(ByteBuffer xevent, long data) { PointerBuffer.put(xevent, xevent.position() + XCOOKIE + XGenericEventCookie.DATA, data); }
	public static void xcookieDataSet(ByteBuffer xevent, ByteBuffer data) { xcookieDataSet(xevent, memAddress(data)); }
	public static void padSet(ByteBuffer xevent, long pad, int bytes) { memCopy(pad, memAddress(xevent) + PAD, bytes); }
	public static void padSet(ByteBuffer xevent, ByteBuffer pad) {
		checkBufferGT(pad, 24 * 8);
		padSet(xevent, memAddress(pad), pad.remaining());
	}

	public static int typeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + TYPE); }
	public static void xanyGet(ByteBuffer xevent, long xany) { memCopy(memAddress(xevent) + XANY, xany, XAnyEvent.SIZEOF); }
	public static void xanyGet(ByteBuffer xevent, ByteBuffer xany) { checkBuffer(xany, XAnyEvent.SIZEOF); xanyGet(xevent, memAddress(xany)); }
	public static int xanyTypeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XANY + XAnyEvent.TYPE); }
	public static long xanySerialGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XANY + XAnyEvent.SERIAL); }
	public static int xanySend_eventGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XANY + XAnyEvent.SEND_EVENT); }
	public static long xanyDisplayGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XANY + XAnyEvent.DISPLAY); }
	public static long xanyWindowGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XANY + XAnyEvent.WINDOW); }
	public static void xkeyGet(ByteBuffer xevent, long xkey) { memCopy(memAddress(xevent) + XKEY, xkey, XKeyEvent.SIZEOF); }
	public static void xkeyGet(ByteBuffer xevent, ByteBuffer xkey) { checkBuffer(xkey, XKeyEvent.SIZEOF); xkeyGet(xevent, memAddress(xkey)); }
	public static int xkeyTypeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.TYPE); }
	public static long xkeySerialGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY + XKeyEvent.SERIAL); }
	public static int xkeySend_eventGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.SEND_EVENT); }
	public static long xkeyDisplayGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY + XKeyEvent.DISPLAY); }
	public static long xkeyWindowGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY + XKeyEvent.WINDOW); }
	public static long xkeyRootGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY + XKeyEvent.ROOT); }
	public static long xkeySubwindowGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY + XKeyEvent.SUBWINDOW); }
	public static long xkeyTimeGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XKEY + XKeyEvent.TIME); }
	public static int xkeyXGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.X); }
	public static int xkeyYGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.Y); }
	public static int xkeyX_rootGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.X_ROOT); }
	public static int xkeyY_rootGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.Y_ROOT); }
	public static int xkeyStateGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.STATE); }
	public static int xkeyKeycodeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.KEYCODE); }
	public static int xkeySame_screenGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XKEY + XKeyEvent.SAME_SCREEN); }
	public static void xbuttonGet(ByteBuffer xevent, long xbutton) { memCopy(memAddress(xevent) + XBUTTON, xbutton, XButtonEvent.SIZEOF); }
	public static void xbuttonGet(ByteBuffer xevent, ByteBuffer xbutton) { checkBuffer(xbutton, XButtonEvent.SIZEOF); xbuttonGet(xevent, memAddress(xbutton)); }
	public static int xbuttonTypeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.TYPE); }
	public static long xbuttonSerialGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XBUTTON + XButtonEvent.SERIAL); }
	public static int xbuttonSend_eventGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.SEND_EVENT); }
	public static long xbuttonDisplayGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XBUTTON + XButtonEvent.DISPLAY); }
	public static long xbuttonWindowGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XBUTTON + XButtonEvent.WINDOW); }
	public static long xbuttonRootGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XBUTTON + XButtonEvent.ROOT); }
	public static long xbuttonSubwindowGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XBUTTON + XButtonEvent.SUBWINDOW); }
	public static long xbuttonTimeGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XBUTTON + XButtonEvent.TIME); }
	public static int xbuttonXGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.X); }
	public static int xbuttonYGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.Y); }
	public static int xbuttonX_rootGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.X_ROOT); }
	public static int xbuttonY_rootGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.Y_ROOT); }
	public static int xbuttonStateGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.STATE); }
	public static int xbuttonButtonGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.BUTTON); }
	public static int xbuttonSame_screenGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XBUTTON + XButtonEvent.SAME_SCREEN); }
	public static void xmotionGet(ByteBuffer xevent, long xmotion) { memCopy(memAddress(xevent) + XMOTION, xmotion, XMotionEvent.SIZEOF); }
	public static void xmotionGet(ByteBuffer xevent, ByteBuffer xmotion) { checkBuffer(xmotion, XMotionEvent.SIZEOF); xmotionGet(xevent, memAddress(xmotion)); }
	public static int xmotionTypeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.TYPE); }
	public static long xmotionSerialGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XMOTION + XMotionEvent.SERIAL); }
	public static int xmotionSend_eventGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.SEND_EVENT); }
	public static long xmotionDisplayGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XMOTION + XMotionEvent.DISPLAY); }
	public static long xmotionWindowGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XMOTION + XMotionEvent.WINDOW); }
	public static long xmotionRootGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XMOTION + XMotionEvent.ROOT); }
	public static long xmotionSubwindowGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XMOTION + XMotionEvent.SUBWINDOW); }
	public static long xmotionTimeGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XMOTION + XMotionEvent.TIME); }
	public static int xmotionXGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.X); }
	public static int xmotionYGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.Y); }
	public static int xmotionX_rootGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.X_ROOT); }
	public static int xmotionY_rootGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.Y_ROOT); }
	public static int xmotionStateGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.STATE); }
	public static int xmotionIs_hintGet(ByteBuffer xevent) { return xevent.get(xevent.position() + XMOTION + XMotionEvent.IS_HINT); }
	public static int xmotionSame_screenGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XMOTION + XMotionEvent.SAME_SCREEN); }
	public static void xconfigureGet(ByteBuffer xevent, long xconfigure) { memCopy(memAddress(xevent) + XCONFIGURE, xconfigure, XConfigureEvent.SIZEOF); }
	public static void xconfigureGet(ByteBuffer xevent, ByteBuffer xconfigure) { checkBuffer(xconfigure, XConfigureEvent.SIZEOF); xconfigureGet(xevent, memAddress(xconfigure)); }
	public static int xconfigureTypeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.TYPE); }
	public static long xconfigureSerialGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.SERIAL); }
	public static int xconfigureSend_eventGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.SEND_EVENT); }
	public static long xconfigureDisplayGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.DISPLAY); }
	public static long xconfigureEventGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.EVENT); }
	public static long xconfigureWindowGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.WINDOW); }
	public static int xconfigureXGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.X); }
	public static int xconfigureYGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.Y); }
	public static int xconfigureWidthGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.WIDTH); }
	public static int xconfigureHeightGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.HEIGHT); }
	public static int xconfigureBorder_widthGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.BORDER_WIDTH); }
	public static long xconfigureAboveGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCONFIGURE + XConfigureEvent.ABOVE); }
	public static int xconfigureOverride_redirectGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCONFIGURE + XConfigureEvent.OVERRIDE_REDIRECT); }
	public static void xpropertyGet(ByteBuffer xevent, long xproperty) { memCopy(memAddress(xevent) + XPROPERTY, xproperty, XPropertyEvent.SIZEOF); }
	public static void xpropertyGet(ByteBuffer xevent, ByteBuffer xproperty) { checkBuffer(xproperty, XPropertyEvent.SIZEOF); xpropertyGet(xevent, memAddress(xproperty)); }
	public static int xpropertyTypeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XPROPERTY + XPropertyEvent.TYPE); }
	public static long xpropertySerialGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XPROPERTY + XPropertyEvent.SERIAL); }
	public static int xpropertySend_eventGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XPROPERTY + XPropertyEvent.SEND_EVENT); }
	public static long xpropertyDisplayGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XPROPERTY + XPropertyEvent.DISPLAY); }
	public static long xpropertyWindowGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XPROPERTY + XPropertyEvent.WINDOW); }
	public static long xpropertyAtomGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XPROPERTY + XPropertyEvent.ATOM); }
	public static long xpropertyTimeGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XPROPERTY + XPropertyEvent.TIME); }
	public static int xpropertyStateGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XPROPERTY + XPropertyEvent.STATE); }
	public static void xselectionrequestGet(ByteBuffer xevent, long xselectionrequest) { memCopy(memAddress(xevent) + XSELECTIONREQUEST, xselectionrequest, XSelectionRequestEvent.SIZEOF); }
	public static void xselectionrequestGet(ByteBuffer xevent, ByteBuffer xselectionrequest) { checkBuffer(xselectionrequest, XSelectionRequestEvent.SIZEOF); xselectionrequestGet(xevent, memAddress(xselectionrequest)); }
	public static int xselectionrequestTypeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.TYPE); }
	public static long xselectionrequestSerialGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.SERIAL); }
	public static int xselectionrequestSend_eventGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.SEND_EVENT); }
	public static long xselectionrequestDisplayGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.DISPLAY); }
	public static long xselectionrequestOwnerGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.OWNER); }
	public static long xselectionrequestRequestorGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.REQUESTOR); }
	public static long xselectionrequestSelectionGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.SELECTION); }
	public static long xselectionrequestTargetGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.TARGET); }
	public static long xselectionrequestPropertyGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.PROPERTY); }
	public static long xselectionrequestTimeGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTIONREQUEST + XSelectionRequestEvent.TIME); }
	public static void xselectionGet(ByteBuffer xevent, long xselection) { memCopy(memAddress(xevent) + XSELECTION, xselection, XSelectionEvent.SIZEOF); }
	public static void xselectionGet(ByteBuffer xevent, ByteBuffer xselection) { checkBuffer(xselection, XSelectionEvent.SIZEOF); xselectionGet(xevent, memAddress(xselection)); }
	public static int xselectionTypeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XSELECTION + XSelectionEvent.TYPE); }
	public static long xselectionSerialGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTION + XSelectionEvent.SERIAL); }
	public static int xselectionSend_eventGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XSELECTION + XSelectionEvent.SEND_EVENT); }
	public static long xselectionDisplayGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTION + XSelectionEvent.DISPLAY); }
	public static long xselectionRequestorGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTION + XSelectionEvent.REQUESTOR); }
	public static long xselectionSelectionGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTION + XSelectionEvent.SELECTION); }
	public static long xselectionTargetGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTION + XSelectionEvent.TARGET); }
	public static long xselectionPropertyGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTION + XSelectionEvent.PROPERTY); }
	public static long xselectionTimeGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XSELECTION + XSelectionEvent.TIME); }
	public static void xclientGet(ByteBuffer xevent, long xclient) { memCopy(memAddress(xevent) + XCLIENT, xclient, XClientMessageEvent.SIZEOF); }
	public static void xclientGet(ByteBuffer xevent, ByteBuffer xclient) { checkBuffer(xclient, XClientMessageEvent.SIZEOF); xclientGet(xevent, memAddress(xclient)); }
	public static int xclientTypeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCLIENT + XClientMessageEvent.TYPE); }
	public static long xclientSerialGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCLIENT + XClientMessageEvent.SERIAL); }
	public static int xclientSend_eventGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCLIENT + XClientMessageEvent.SEND_EVENT); }
	public static long xclientDisplayGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCLIENT + XClientMessageEvent.DISPLAY); }
	public static long xclientWindowGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCLIENT + XClientMessageEvent.WINDOW); }
	public static long xclientMessage_typeGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCLIENT + XClientMessageEvent.MESSAGE_TYPE); }
	public static int xclientFormatGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCLIENT + XClientMessageEvent.FORMAT); }
	public static void xclientDataBGet(ByteBuffer xevent, long b, int bytes) {
		memCopy(memAddress(xevent) + XCLIENT + XClientMessageEvent.DATA_B, b, bytes);
	}
	public static void xclientDataBGetb(ByteBuffer xevent, ByteBuffer b) {
		checkBufferGT(b, 20 * 1);
		xclientDataBGet(xevent, memAddress(b), b.remaining());
	}
	public static void xclientDataSGet(ByteBuffer xevent, long s, int bytes) {
		memCopy(memAddress(xevent) + XCLIENT + XClientMessageEvent.DATA_S, s, bytes);
	}
	public static void xclientDataSGetb(ByteBuffer xevent, ByteBuffer s) {
		checkBufferGT(s, 10 * 2);
		xclientDataSGet(xevent, memAddress(s), s.remaining());
	}
	public static void xclientDataLGet(ByteBuffer xevent, long l, int bytes) {
		memCopy(memAddress(xevent) + XCLIENT + XClientMessageEvent.DATA_L, l, bytes);
	}
	public static void xclientDataLGetb(ByteBuffer xevent, ByteBuffer l) {
		checkBufferGT(l, 5 * 8);
		xclientDataLGet(xevent, memAddress(l), l.remaining());
	}
	public static void xerrorGet(ByteBuffer xevent, long xerror) { memCopy(memAddress(xevent) + XERROR, xerror, XErrorEvent.SIZEOF); }
	public static void xerrorGet(ByteBuffer xevent, ByteBuffer xerror) { checkBuffer(xerror, XErrorEvent.SIZEOF); xerrorGet(xevent, memAddress(xerror)); }
	public static int xerrorTypeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XERROR + XErrorEvent.TYPE); }
	public static long xerrorDisplayGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XERROR + XErrorEvent.DISPLAY); }
	public static long xerrorSerialGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XERROR + XErrorEvent.SERIAL); }
	public static int xerrorError_codeGet(ByteBuffer xevent) { return xevent.get(xevent.position() + XERROR + XErrorEvent.ERROR_CODE) & 0xFF; }
	public static int xerrorRequest_codeGet(ByteBuffer xevent) { return xevent.get(xevent.position() + XERROR + XErrorEvent.REQUEST_CODE) & 0xFF; }
	public static int xerrorMinor_codeGet(ByteBuffer xevent) { return xevent.get(xevent.position() + XERROR + XErrorEvent.MINOR_CODE) & 0xFF; }
	public static long xerrorResourceidGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XERROR + XErrorEvent.RESOURCEID); }
	public static void xcookieGet(ByteBuffer xevent, long xcookie) { memCopy(memAddress(xevent) + XCOOKIE, xcookie, XGenericEventCookie.SIZEOF); }
	public static void xcookieGet(ByteBuffer xevent, ByteBuffer xcookie) { checkBuffer(xcookie, XGenericEventCookie.SIZEOF); xcookieGet(xevent, memAddress(xcookie)); }
	public static int xcookieTypeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCOOKIE + XGenericEventCookie.TYPE); }
	public static long xcookieSerialGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCOOKIE + XGenericEventCookie.SERIAL); }
	public static int xcookieSend_eventGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCOOKIE + XGenericEventCookie.SEND_EVENT); }
	public static long xcookieDisplayGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCOOKIE + XGenericEventCookie.DISPLAY); }
	public static int xcookieExtensionGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCOOKIE + XGenericEventCookie.EXTENSION); }
	public static int xcookieEvtypeGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCOOKIE + XGenericEventCookie.EVTYPE); }
	public static int xcookieCookieGet(ByteBuffer xevent) { return xevent.getInt(xevent.position() + XCOOKIE + XGenericEventCookie.COOKIE); }
	public static long xcookieDataGet(ByteBuffer xevent) { return PointerBuffer.get(xevent, xevent.position() + XCOOKIE + XGenericEventCookie.DATA); }
	public static ByteBuffer xcookieDataGet(ByteBuffer xevent, int size) { long address = xcookieDataGet(xevent); return address == 0 ? null : memByteBuffer(address, size); }
	public static void padGet(ByteBuffer xevent, long pad, int bytes) {
		memCopy(memAddress(xevent) + PAD, pad, bytes);
	}
	public static void padGetb(ByteBuffer xevent, ByteBuffer pad) {
		checkBufferGT(pad, 24 * 8);
		padGet(xevent, memAddress(pad), pad.remaining());
	}

}