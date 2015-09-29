/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class GLXStereoNotifyEventEXT extends Struct {

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
		IntBuffer offsets = memAllocInt(8);

		SIZEOF = offsets(memAddress(offsets));

		TYPE = offsets.get(0);
		SERIAL = offsets.get(1);
		SEND_EVENT = offsets.get(2);
		DISPLAY = offsets.get(3);
		EXTENSION = offsets.get(4);
		EVTYPE = offsets.get(5);
		WINDOW = offsets.get(6);
		STEREO_TREE = offsets.get(7);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	GLXStereoNotifyEventEXT(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link GLXStereoNotifyEventEXT} instance at the specified memory address. */
	public GLXStereoNotifyEventEXT(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link GLXStereoNotifyEventEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GLXStereoNotifyEventEXT(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getType() { return ngetType(address()); }
	public long getSerial() { return ngetSerial(address()); }
	public int getSendEvent() { return ngetSendEvent(address()); }
	public long getDisplay() { return ngetDisplay(address()); }
	public int getExtension() { return ngetExtension(address()); }
	public int getEvtype() { return ngetEvtype(address()); }
	public long getWindow() { return ngetWindow(address()); }
	public int getStereoTree() { return ngetStereoTree(address()); }

	public GLXStereoNotifyEventEXT setType(int type) { nsetType(address(), type); return this; }
	public GLXStereoNotifyEventEXT setSerial(long serial) { nsetSerial(address(), serial); return this; }
	public GLXStereoNotifyEventEXT setSendEvent(int send_event) { nsetSendEvent(address(), send_event); return this; }
	public GLXStereoNotifyEventEXT setDisplay(long display) { nsetDisplay(address(), display); return this; }
	public GLXStereoNotifyEventEXT setExtension(int extension) { nsetExtension(address(), extension); return this; }
	public GLXStereoNotifyEventEXT setEvtype(int evtype) { nsetEvtype(address(), evtype); return this; }
	public GLXStereoNotifyEventEXT setWindow(long window) { nsetWindow(address(), window); return this; }
	public GLXStereoNotifyEventEXT setStereoTree(int stereo_tree) { nsetStereoTree(address(), stereo_tree); return this; }

	/** Initializes this struct with the specified values. */
	public GLXStereoNotifyEventEXT set(
		int type,
		long serial,
		int send_event,
		long display,
		int extension,
		int evtype,
		long window,
		int stereo_tree
	) {
		setType(type);
		setSerial(serial);
		setSendEvent(send_event);
		setDisplay(display);
		setExtension(extension);
		setEvtype(evtype);
		setWindow(window);
		setStereoTree(stereo_tree);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public GLXStereoNotifyEventEXT nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public GLXStereoNotifyEventEXT set(GLXStereoNotifyEventEXT src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public GLXStereoNotifyEventEXT set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link GLXStereoNotifyEventEXT} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static GLXStereoNotifyEventEXT malloc() {
		return new GLXStereoNotifyEventEXT(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GLXStereoNotifyEventEXT} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static GLXStereoNotifyEventEXT calloc() {
		return new GLXStereoNotifyEventEXT(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GLXStereoNotifyEventEXT} instance allocated with {@link BufferUtils}. */
	public static GLXStereoNotifyEventEXT create() {
		return new GLXStereoNotifyEventEXT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link GLXStereoNotifyEventEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link GLXStereoNotifyEventEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link GLXStereoNotifyEventEXT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static int ngetType(long struct) { return memGetInt(struct + TYPE); }
	public static int getType(ByteBuffer struct) { return ngetType(memAddress(struct)); }
	public static long ngetSerial(long struct) { return memGetAddress(struct + SERIAL); }
	public static long getSerial(ByteBuffer struct) { return ngetSerial(memAddress(struct)); }
	public static int ngetSendEvent(long struct) { return memGetInt(struct + SEND_EVENT); }
	public static int getSendEvent(ByteBuffer struct) { return ngetSendEvent(memAddress(struct)); }
	public static long ngetDisplay(long struct) { return memGetAddress(struct + DISPLAY); }
	public static long getDisplay(ByteBuffer struct) { return ngetDisplay(memAddress(struct)); }
	public static int ngetExtension(long struct) { return memGetInt(struct + EXTENSION); }
	public static int getExtension(ByteBuffer struct) { return ngetExtension(memAddress(struct)); }
	public static int ngetEvtype(long struct) { return memGetInt(struct + EVTYPE); }
	public static int getEvtype(ByteBuffer struct) { return ngetEvtype(memAddress(struct)); }
	public static long ngetWindow(long struct) { return memGetAddress(struct + WINDOW); }
	public static long getWindow(ByteBuffer struct) { return ngetWindow(memAddress(struct)); }
	public static int ngetStereoTree(long struct) { return memGetInt(struct + STEREO_TREE); }
	public static int getStereoTree(ByteBuffer struct) { return ngetStereoTree(memAddress(struct)); }

	public static void nsetType(long struct, int type) { memPutInt(struct + TYPE, type); }
	public static void setType(ByteBuffer struct, int type) { nsetType(memAddress(struct), type); }
	public static void nsetSerial(long struct, long serial) { memPutAddress(struct + SERIAL, serial); }
	public static void setSerial(ByteBuffer struct, long serial) { nsetSerial(memAddress(struct), serial); }
	public static void nsetSendEvent(long struct, int send_event) { memPutInt(struct + SEND_EVENT, send_event); }
	public static void setSendEvent(ByteBuffer struct, int send_event) { nsetSendEvent(memAddress(struct), send_event); }
	public static void nsetDisplay(long struct, long display) { memPutAddress(struct + DISPLAY, display); }
	public static void setDisplay(ByteBuffer struct, long display) { nsetDisplay(memAddress(struct), display); }
	public static void nsetExtension(long struct, int extension) { memPutInt(struct + EXTENSION, extension); }
	public static void setExtension(ByteBuffer struct, int extension) { nsetExtension(memAddress(struct), extension); }
	public static void nsetEvtype(long struct, int evtype) { memPutInt(struct + EVTYPE, evtype); }
	public static void setEvtype(ByteBuffer struct, int evtype) { nsetEvtype(memAddress(struct), evtype); }
	public static void nsetWindow(long struct, long window) { memPutAddress(struct + WINDOW, window); }
	public static void setWindow(ByteBuffer struct, long window) { nsetWindow(memAddress(struct), window); }
	public static void nsetStereoTree(long struct, int stereo_tree) { memPutInt(struct + STEREO_TREE, stereo_tree); }
	public static void setStereoTree(ByteBuffer struct, int stereo_tree) { nsetStereoTree(memAddress(struct), stereo_tree); }

	// -----------------------------------

	/** An array of {@link GLXStereoNotifyEventEXT} structs. */
	public static final class Buffer extends StructBuffer<GLXStereoNotifyEventEXT, Buffer> {

		/**
		 * Creates a new {@link GLXStereoNotifyEventEXT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link GLXStereoNotifyEventEXT#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected GLXStereoNotifyEventEXT newInstance(long address) {
			return new GLXStereoNotifyEventEXT(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}