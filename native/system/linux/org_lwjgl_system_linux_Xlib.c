/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
#include "LinuxLWJGL.h"
#include <X11/Xutil.h>

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xlib_nXSetErrorHandler(JNIEnv *__env, jclass clazz, jlong handlerAddress) {
	XErrorHandler handler = (XErrorHandler)(intptr_t)handlerAddress;
	return (jlong)(intptr_t)XSetErrorHandler(handler);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXFree(JNIEnv *__env, jclass clazz, jlong dataAddress) {
	void *data = (void *)(intptr_t)dataAddress;
	return (jint)XFree(data);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xlib_nXOpenDisplay(JNIEnv *__env, jclass clazz, jlong display_nameAddress) {
	const char *display_name = (const char *)(intptr_t)display_nameAddress;
	return (jlong)(intptr_t)XOpenDisplay(display_name);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXCloseDisplay(JNIEnv *__env, jclass clazz, jlong displayAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XCloseDisplay(display);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xlib_nXInternAtom(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong atom_nameAddress, jint only_if_exists) {
	Display *display = (Display *)(intptr_t)displayAddress;
	const char *atom_name = (const char *)(intptr_t)atom_nameAddress;
	return (jlong)XInternAtom(display, atom_name, only_if_exists);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXDefaultScreen(JNIEnv *__env, jclass clazz, jlong displayAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XDefaultScreen(display);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXDefaultDepth(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen_number) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XDefaultDepth(display, screen_number);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXDisplayWidth(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen_number) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XDisplayWidth(display, screen_number);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXDisplayHeight(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen_number) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XDisplayHeight(display, screen_number);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXSync(JNIEnv *__env, jclass clazz, jlong displayAddress, jint discard) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XSync(display, discard);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xlib_nXRootWindow(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen_number) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jlong)XRootWindow(display, screen_number);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXQueryExtension(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong nameAddress, jlong major_opcode_returnAddress, jlong first_event_returnAddress, jlong first_error_returnAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	const char *name = (const char *)(intptr_t)nameAddress;
	int *major_opcode_return = (int *)(intptr_t)major_opcode_returnAddress;
	int *first_event_return = (int *)(intptr_t)first_event_returnAddress;
	int *first_error_return = (int *)(intptr_t)first_error_returnAddress;
	return (jint)XQueryExtension(display, name, major_opcode_return, first_event_return, first_error_return);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXFlush(JNIEnv *__env, jclass clazz, jlong displayAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XFlush(display);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXPending(JNIEnv *__env, jclass clazz, jlong displayAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XPending(display);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXNextEvent(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong event_returnAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XEvent *event_return = (XEvent *)(intptr_t)event_returnAddress;
	return (jint)XNextEvent(display, event_return);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xlib_nXCreateColormap(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jlong visualAddress, jint alloc) {
	Display *display = (Display *)(intptr_t)displayAddress;
	Visual *visual = (Visual *)(intptr_t)visualAddress;
	return (jlong)XCreateColormap(display, (Window)w, visual, alloc);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXFreeColormap(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong colormap) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XFreeColormap(display, (Colormap)colormap);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xlib_nXScreenOfDisplay(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen_number) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jlong)(intptr_t)XScreenOfDisplay(display, screen_number);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xlib_nXBlackPixel(JNIEnv *__env, jclass clazz, jlong displayAddress, jint screen_number) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jlong)XBlackPixel(display, screen_number);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXConnectionNumber(JNIEnv *__env, jclass clazz, jlong displayAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XConnectionNumber(display);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xlib_nXCreateWindow(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong parent, jint x, jint y, jint width, jint height, jint border_width, jint depth, jint windowClass, jlong visualAddress, jlong valuemask, jlong attributesAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	Visual *visual = (Visual *)(intptr_t)visualAddress;
	XSetWindowAttributes *attributes = (XSetWindowAttributes *)(intptr_t)attributesAddress;
	return (jlong)XCreateWindow(display, (Window)parent, x, y, width, height, border_width, depth, windowClass, visual, (unsigned long)valuemask, attributes);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXChangeWindowAttributes(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jlong valuemask, jlong attributesAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XSetWindowAttributes *attributes = (XSetWindowAttributes *)(intptr_t)attributesAddress;
	return (jint)XChangeWindowAttributes(display, (Window)w, (unsigned long)valuemask, attributes);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXSetWMProtocols(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jlong protocolsAddress, jint count) {
	Display *display = (Display *)(intptr_t)displayAddress;
	Atom *protocols = (Atom *)(intptr_t)protocolsAddress;
	return (jint)XSetWMProtocols(display, (Window)w, protocols, count);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXSetWMHints(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jlong hintsAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XWMHints *hints = (XWMHints *)(intptr_t)hintsAddress;
	return (jint)XSetWMHints(display, (Window)w, hints);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXSetSizeHints(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jlong hintsAddress, jlong property) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XSizeHints *hints = (XSizeHints *)(intptr_t)hintsAddress;
	return (jint)XSetSizeHints(display, (Window)w, hints, (Atom)property);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xlib_nXSetWMNormalHints(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jlong hintsAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XSizeHints *hints = (XSizeHints *)(intptr_t)hintsAddress;
	XSetWMNormalHints(display, (Window)w, hints);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXGrabPointer(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong grab_window, jint owner_events, jint event_mask, jint pointer_mode, jint keyboard_mode, jlong confine_to, jlong cursor, jlong time) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XGrabPointer(display, (Window)grab_window, owner_events, event_mask, pointer_mode, keyboard_mode, (Window)confine_to, (Cursor)cursor, (Time)time);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXUngrabPointer(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong time) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XUngrabPointer(display, (Time)time);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXDefineCursor(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jlong cursor) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XDefineCursor(display, (Window)w, (Cursor)cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXUndefineCursor(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XUndefineCursor(display, (Window)w);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXFreeCursor(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong cursor) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XFreeCursor(display, (Cursor)cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXGetScreenSaver(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong timeout_returnAddress, jlong interval_returnAddress, jlong prefer_blanking_returnAddress, jlong allow_exposures_returnAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *timeout_return = (int *)(intptr_t)timeout_returnAddress;
	int *interval_return = (int *)(intptr_t)interval_returnAddress;
	int *prefer_blanking_return = (int *)(intptr_t)prefer_blanking_returnAddress;
	int *allow_exposures_return = (int *)(intptr_t)allow_exposures_returnAddress;
	return (jint)XGetScreenSaver(display, timeout_return, interval_return, prefer_blanking_return, allow_exposures_return);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXSetScreenSaver(JNIEnv *__env, jclass clazz, jlong displayAddress, jint timeout_return, jint interval_return, jint prefer_blanking_return, jint allow_exposures_return) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XSetScreenSaver(display, timeout_return, interval_return, prefer_blanking_return, allow_exposures_return);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXSendEvent(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jint propagate, jlong event_mask, jlong event_sendAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XEvent *event_send = (XEvent *)(intptr_t)event_sendAddress;
	return (jint)XSendEvent(display, (Window)w, propagate, (long)event_mask, event_send);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXRaiseWindow(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XRaiseWindow(display, (Window)w);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXSetInputFocus(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong focus, jint revert_to, jlong time) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XSetInputFocus(display, (Window)focus, revert_to, (Time)time);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXMoveWindow(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jint x, jint y) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XMoveWindow(display, (Window)w, x, y);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXResizeWindow(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jint width, jint height) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XResizeWindow(display, (Window)w, width, height);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXGetEventData(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong cookieAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XGenericEventCookie *cookie = (XGenericEventCookie *)(intptr_t)cookieAddress;
	return (jint)XGetEventData(display, cookie);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xlib_nXFreeEventData(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong cookieAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XGenericEventCookie *cookie = (XGenericEventCookie *)(intptr_t)cookieAddress;
	XFreeEventData(display, cookie);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXGetWindowProperty(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jlong property, jlong long_offset, jlong long_length, jint delete, jlong req_type, jlong actual_type_returnAddress, jlong actual_format_returnAddress, jlong nitems_returnAddress, jlong bytes_after_returnAddress, jlong prop_returnAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	Atom *actual_type_return = (Atom *)(intptr_t)actual_type_returnAddress;
	int *actual_format_return = (int *)(intptr_t)actual_format_returnAddress;
	unsigned long *nitems_return = (unsigned long *)(intptr_t)nitems_returnAddress;
	unsigned long *bytes_after_return = (unsigned long *)(intptr_t)bytes_after_returnAddress;
	unsigned char **prop_return = (unsigned char **)(intptr_t)prop_returnAddress;
	return (jint)XGetWindowProperty(display, (Window)w, (Atom)property, (long)long_offset, (long)long_length, delete, (Atom)req_type, actual_type_return, actual_format_return, nitems_return, bytes_after_return, prop_return);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXDeleteProperty(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jlong property) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XDeleteProperty(display, (Window)w, (Atom)property);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXQueryPointer(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jlong root_returnAddress, jlong child_returnAddress, jlong root_x_returnAddress, jlong root_y_returnAddress, jlong win_x_returnAddress, jlong win_y_returnAddress, jlong mask_returnAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	Window *root_return = (Window *)(intptr_t)root_returnAddress;
	Window *child_return = (Window *)(intptr_t)child_returnAddress;
	int *root_x_return = (int *)(intptr_t)root_x_returnAddress;
	int *root_y_return = (int *)(intptr_t)root_y_returnAddress;
	int *win_x_return = (int *)(intptr_t)win_x_returnAddress;
	int *win_y_return = (int *)(intptr_t)win_y_returnAddress;
	unsigned int *mask_return = (unsigned int *)(intptr_t)mask_returnAddress;
	return (jint)XQueryPointer(display, (Window)w, root_return, child_return, root_x_return, root_y_return, win_x_return, win_y_return, mask_return);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXUnmapWindow(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XUnmapWindow(display, (Window)w);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXDestroyWindow(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XDestroyWindow(display, (Window)w);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_linux_Xlib_nXutf8SetWMProperties(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jlong window_nameAddress, jlong icon_nameAddress, jlong argvAddress, jint argc, jlong normal_hintsAddress, jlong wm_hintsAddress, jlong class_hintsAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	const char *window_name = (const char *)(intptr_t)window_nameAddress;
	const char *icon_name = (const char *)(intptr_t)icon_nameAddress;
	char **argv = (char **)(intptr_t)argvAddress;
	XSizeHints *normal_hints = (XSizeHints *)(intptr_t)normal_hintsAddress;
	XWMHints *wm_hints = (XWMHints *)(intptr_t)wm_hintsAddress;
	XClassHint *class_hints = (XClassHint *)(intptr_t)class_hintsAddress;
	Xutf8SetWMProperties(display, (Window)w, window_name, icon_name, argv, argc, normal_hints, wm_hints, class_hints);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXChangeProperty(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jlong property, jlong type, jint format, jint mode, jlong dataAddress, jint nelements) {
	Display *display = (Display *)(intptr_t)displayAddress;
	const unsigned char *data = (const unsigned char *)(intptr_t)dataAddress;
	return (jint)XChangeProperty(display, (Window)w, (Atom)property, (Atom)type, format, mode, data, nelements);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXTranslateCoordinates(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong src_w, jlong dest_w, jint src_x, jint src_y, jlong dest_x_returnAddress, jlong dest_y_returnAddress, jlong child_returnAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	int *dest_x_return = (int *)(intptr_t)dest_x_returnAddress;
	int *dest_y_return = (int *)(intptr_t)dest_y_returnAddress;
	Window *child_return = (Window *)(intptr_t)child_returnAddress;
	return (jint)XTranslateCoordinates(display, (Window)src_w, (Window)dest_w, src_x, src_y, dest_x_return, dest_y_return, child_return);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXGetWindowAttributes(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jlong window_attributes_returnAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XWindowAttributes *window_attributes_return = (XWindowAttributes *)(intptr_t)window_attributes_returnAddress;
	return (jint)XGetWindowAttributes(display, (Window)w, window_attributes_return);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXIconifyWindow(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w, jint screen_number) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XIconifyWindow(display, (Window)w, screen_number);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXMapWindow(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XMapWindow(display, (Window)w);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXMapRaised(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong w) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XMapRaised(display, (Window)w);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXWarpPointer(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong src_w, jlong dest_w, jint src_x, jint src_y, jint src_width, jint src_height, jint dest_x, jint dest_y) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XWarpPointer(display, (Window)src_w, (Window)dest_w, src_x, src_y, src_width, src_height, dest_x, dest_y);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXSetSelectionOwner(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong selection, jlong owner, jlong time) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XSetSelectionOwner(display, (Atom)selection, (Window)owner, (Time)time);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xlib_nXGetSelectionOwner(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong selection) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jlong)XGetSelectionOwner(display, (Atom)selection);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXConvertSelection(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong selection, jlong target, jlong property, jlong requestor, jlong time) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XConvertSelection(display, (Atom)selection, (Atom)target, (Atom)property, (Window)requestor, (Time)time);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXCheckTypedEvent(JNIEnv *__env, jclass clazz, jlong displayAddress, jint event_type, jlong event_returnAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XEvent *event_return = (XEvent *)(intptr_t)event_returnAddress;
	return (jint)XCheckTypedEvent(display, event_type, event_return);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xlib_nXCreatePixmap(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong d, jint width, jint height, jint depth) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jlong)XCreatePixmap(display, (Drawable)d, width, height, depth);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xlib_nXCreateGC(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong d, jlong valuemask, jlong valuesAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XGCValues *values = (XGCValues *)(intptr_t)valuesAddress;
	return (jlong)(intptr_t)XCreateGC(display, (Drawable)d, (unsigned long)valuemask, values);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXFillRectangle(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong d, jlong gcAddress, jint x, jint y, jint width, jint height) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GC gc = (GC)(intptr_t)gcAddress;
	return (jint)XFillRectangle(display, (Drawable)d, gc, x, y, width, height);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_linux_Xlib_nXCreatePixmapCursor(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong source, jlong mask, jlong foreground_colorAddress, jlong background_colorAddress, jint x, jint y) {
	Display *display = (Display *)(intptr_t)displayAddress;
	XColor *foreground_color = (XColor *)(intptr_t)foreground_colorAddress;
	XColor *background_color = (XColor *)(intptr_t)background_colorAddress;
	return (jlong)XCreatePixmapCursor(display, (Pixmap)source, (Pixmap)mask, foreground_color, background_color, x, y);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXFreePixmap(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong pixmap) {
	Display *display = (Display *)(intptr_t)displayAddress;
	return (jint)XFreePixmap(display, (Pixmap)pixmap);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_linux_Xlib_nXFreeGC(JNIEnv *__env, jclass clazz, jlong displayAddress, jlong gcAddress) {
	Display *display = (Display *)(intptr_t)displayAddress;
	GC gc = (GC)(intptr_t)gcAddress;
	return (jint)XFreeGC(display, gc);
}