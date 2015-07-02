/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class GLXStereoNotifyEventEXT implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		SERIAL,
		SEND_EVENT,
		DISPLAY,
		EXTENSION,
		EVTYPE,
		WINDOW,
		STEREO_TREE;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(8);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		SERIAL = offsets.get(1);
		SEND_EVENT = offsets.get(2);
		DISPLAY = offsets.get(3);
		EXTENSION = offsets.get(4);
		EVTYPE = offsets.get(5);
		WINDOW = offsets.get(6);
		STEREO_TREE = offsets.get(7);
	}

	private final ByteBuffer struct;

	public GLXStereoNotifyEventEXT() {
		this(malloc());
	}

	public GLXStereoNotifyEventEXT(ByteBuffer struct) {
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
	public void setSerial(long serial) { serial(struct, serial); }
	public void setSendEvent(int send_event) { send_event(struct, send_event); }
	public void setDisplay(long display) { display(struct, display); }
	public void setExtension(int extension) { extension(struct, extension); }
	public void setEvtype(int evtype) { evtype(struct, evtype); }
	public void setWindow(long window) { window(struct, window); }
	public void setStereoTree(int stereo_tree) { stereo_tree(struct, stereo_tree); }

	public int getType() { return type(struct); }
	public long getSerial() { return serial(struct); }
	public int getSendEvent() { return send_event(struct); }
	public long getDisplay() { return display(struct); }
	public int getExtension() { return extension(struct); }
	public int getEvtype() { return evtype(struct); }
	public long getWindow() { return window(struct); }
	public int getStereoTree() { return stereo_tree(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int type,
		long serial,
		int send_event,
		long display,
		int extension,
		int evtype,
		long window,
		int stereo_tree
	) {
		ByteBuffer glxstereonotifyeventext = malloc();

		type(glxstereonotifyeventext, type);
		serial(glxstereonotifyeventext, serial);
		send_event(glxstereonotifyeventext, send_event);
		display(glxstereonotifyeventext, display);
		extension(glxstereonotifyeventext, extension);
		evtype(glxstereonotifyeventext, evtype);
		window(glxstereonotifyeventext, window);
		stereo_tree(glxstereonotifyeventext, stereo_tree);

		return glxstereonotifyeventext;
	}

	public static void type(ByteBuffer glxstereonotifyeventext, int type) { glxstereonotifyeventext.putInt(glxstereonotifyeventext.position() + TYPE, type); }
	public static void serial(ByteBuffer glxstereonotifyeventext, long serial) { PointerBuffer.put(glxstereonotifyeventext, glxstereonotifyeventext.position() + SERIAL, serial); }
	public static void send_event(ByteBuffer glxstereonotifyeventext, int send_event) { glxstereonotifyeventext.putInt(glxstereonotifyeventext.position() + SEND_EVENT, send_event); }
	public static void display(ByteBuffer glxstereonotifyeventext, long display) { PointerBuffer.put(glxstereonotifyeventext, glxstereonotifyeventext.position() + DISPLAY, display); }
	public static void extension(ByteBuffer glxstereonotifyeventext, int extension) { glxstereonotifyeventext.putInt(glxstereonotifyeventext.position() + EXTENSION, extension); }
	public static void evtype(ByteBuffer glxstereonotifyeventext, int evtype) { glxstereonotifyeventext.putInt(glxstereonotifyeventext.position() + EVTYPE, evtype); }
	public static void window(ByteBuffer glxstereonotifyeventext, long window) { PointerBuffer.put(glxstereonotifyeventext, glxstereonotifyeventext.position() + WINDOW, window); }
	public static void stereo_tree(ByteBuffer glxstereonotifyeventext, int stereo_tree) { glxstereonotifyeventext.putInt(glxstereonotifyeventext.position() + STEREO_TREE, stereo_tree); }

	public static int type(ByteBuffer glxstereonotifyeventext) { return glxstereonotifyeventext.getInt(glxstereonotifyeventext.position() + TYPE); }
	public static long serial(ByteBuffer glxstereonotifyeventext) { return PointerBuffer.get(glxstereonotifyeventext, glxstereonotifyeventext.position() + SERIAL); }
	public static int send_event(ByteBuffer glxstereonotifyeventext) { return glxstereonotifyeventext.getInt(glxstereonotifyeventext.position() + SEND_EVENT); }
	public static long display(ByteBuffer glxstereonotifyeventext) { return PointerBuffer.get(glxstereonotifyeventext, glxstereonotifyeventext.position() + DISPLAY); }
	public static int extension(ByteBuffer glxstereonotifyeventext) { return glxstereonotifyeventext.getInt(glxstereonotifyeventext.position() + EXTENSION); }
	public static int evtype(ByteBuffer glxstereonotifyeventext) { return glxstereonotifyeventext.getInt(glxstereonotifyeventext.position() + EVTYPE); }
	public static long window(ByteBuffer glxstereonotifyeventext) { return PointerBuffer.get(glxstereonotifyeventext, glxstereonotifyeventext.position() + WINDOW); }
	public static int stereo_tree(ByteBuffer glxstereonotifyeventext) { return glxstereonotifyeventext.getInt(glxstereonotifyeventext.position() + STEREO_TREE); }

}