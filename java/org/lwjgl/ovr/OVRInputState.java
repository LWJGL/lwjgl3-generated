/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Describes the complete controller input state, including Oculus Touch, and XBox gamepad. If multiple inputs are connected and used at the same time,
 * their inputs are combined.
 * 
 * <h3>ovrInputState members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>TimeInSeconds</td><td class="nw">double</td><td>system type when the controller state was last updated</td></tr>
 * <tr><td>ConnectedControllerTypes</td><td class="nw">unsigned int</td><td>described by {@code ovrControllerType}. Indicates which ControllerTypes are present.</td></tr>
 * <tr><td>Buttons</td><td class="nw">unsigned int</td><td>values for buttons described by {@code ovrButton}</td></tr>
 * <tr><td>Touches</td><td class="nw">unsigned int</td><td>touch values for buttons and sensors as described by {@code ovrTouch}.</td></tr>
 * <tr><td>IndexTrigger</td><td class="nw">float[2]</td><td>left and right finger trigger values ({@link OVR#ovrHand_Left} and {@link OVR#ovrHand_Right}), in the range 0.0 to 1.0f.</td></tr>
 * <tr><td>HandTrigger</td><td class="nw">float[2]</td><td>left and right hand trigger values ({@link OVR#ovrHand_Left} and {@link OVR#ovrHand_Right}), in the range 0.0 to 1.0f.</td></tr>
 * <tr><td>Thumbstick</td><td class="nw">ovrVector2f[2]</td><td>horizontal and vertical thumbstick axis values ({@link OVR#ovrHand_Left} and {@link OVR#ovrHand_Right}), in the range -1.0f to 1.0f.</td></tr>
 * </table>
 */
public class OVRInputState extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		TIMEINSECONDS,
		CONNECTEDCONTROLLERTYPES,
		BUTTONS,
		TOUCHES,
		INDEXTRIGGER,
		HANDTRIGGER,
		THUMBSTICK;

	static {
		Layout layout = __struct(
			__member(8),
			__member(4),
			__member(4),
			__member(4),
			__array(4, 2),
			__array(4, 2),
			__array(OVRVector2f.SIZEOF, OVRVector2f.__ALIGNMENT, 2)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		TIMEINSECONDS = layout.offsetof(0);
		CONNECTEDCONTROLLERTYPES = layout.offsetof(1);
		BUTTONS = layout.offsetof(2);
		TOUCHES = layout.offsetof(3);
		INDEXTRIGGER = layout.offsetof(4);
		HANDTRIGGER = layout.offsetof(5);
		THUMBSTICK = layout.offsetof(6);
	}

	OVRInputState(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRInputState} instance at the specified memory address. */
	public OVRInputState(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRInputState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRInputState(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code TimeInSeconds} field. */
	public double TimeInSeconds() { return nTimeInSeconds(address()); }
	/** Returns the value of the {@code ConnectedControllerTypes} field. */
	public int ConnectedControllerTypes() { return nConnectedControllerTypes(address()); }
	/** Returns the value of the {@code Buttons} field. */
	public int Buttons() { return nButtons(address()); }
	/** Returns the value of the {@code Touches} field. */
	public int Touches() { return nTouches(address()); }
	/** Returns a {@link FloatBuffer} view of the {@code IndexTrigger} field. */
	public FloatBuffer IndexTrigger() { return nIndexTrigger(address()); }
	/** Returns the value at the specified index of the {@code IndexTrigger} field. */
	public float IndexTrigger(int index) { return nIndexTrigger(address(), index); }
	/** Returns a {@link FloatBuffer} view of the {@code HandTrigger} field. */
	public FloatBuffer HandTrigger() { return nHandTrigger(address()); }
	/** Returns the value at the specified index of the {@code HandTrigger} field. */
	public float HandTrigger(int index) { return nHandTrigger(address(), index); }
	/** Returns a {@link OVRVector2f}.Buffer view of the {@code Thumbstick} field. */
	public OVRVector2f.Buffer Thumbstick() { return nThumbstick(address()); }
	/** Returns a {@link OVRVector2f} view of the struct at the specified index of the {@code Thumbstick} field. */
	public OVRVector2f Thumbstick(int index) { return nThumbstick(address(), index); }

	/** Sets the specified value to the {@code TimeInSeconds} field. */
	public OVRInputState TimeInSeconds(double value) { nTimeInSeconds(address(), value); return this; }
	/** Sets the specified value to the {@code ConnectedControllerTypes} field. */
	public OVRInputState ConnectedControllerTypes(int value) { nConnectedControllerTypes(address(), value); return this; }
	/** Sets the specified value to the {@code Buttons} field. */
	public OVRInputState Buttons(int value) { nButtons(address(), value); return this; }
	/** Sets the specified value to the {@code Touches} field. */
	public OVRInputState Touches(int value) { nTouches(address(), value); return this; }
	/** Copies the specified {@link FloatBuffer} to the {@code IndexTrigger} field. */
	public OVRInputState IndexTrigger(FloatBuffer value) { nIndexTrigger(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code IndexTrigger} field. */
	public OVRInputState IndexTrigger(int index, float value) { nIndexTrigger(address(), index, value); return this; }
	/** Copies the specified {@link FloatBuffer} to the {@code HandTrigger} field. */
	public OVRInputState HandTrigger(FloatBuffer value) { nHandTrigger(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code HandTrigger} field. */
	public OVRInputState HandTrigger(int index, float value) { nHandTrigger(address(), index, value); return this; }
	/** Copies the specified {@link OVRVector2f.Buffer} to the {@code Thumbstick} field. */
	public OVRInputState Thumbstick(OVRVector2f.Buffer value) { nThumbstick(address(), value); return this; }
	/** Copies the specified {@link OVRVector2f} at the specified index of the {@code Thumbstick} field. */
	public OVRInputState Thumbstick(int index, OVRVector2f value) { nThumbstick(address(), index, value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRInputState set(
		double TimeInSeconds,
		int ConnectedControllerTypes,
		int Buttons,
		int Touches,
		FloatBuffer IndexTrigger,
		FloatBuffer HandTrigger,
		OVRVector2f.Buffer Thumbstick
	) {
		TimeInSeconds(TimeInSeconds);
		ConnectedControllerTypes(ConnectedControllerTypes);
		Buttons(Buttons);
		Touches(Touches);
		IndexTrigger(IndexTrigger);
		HandTrigger(HandTrigger);
		Thumbstick(Thumbstick);

		return this;
	}

	/** Unsafe version of {@link #set(OVRInputState) set}. */
	public OVRInputState nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public OVRInputState set(OVRInputState src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRInputState) set}. */
	public OVRInputState set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRInputState} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRInputState malloc() {
		return new OVRInputState(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRInputState} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRInputState calloc() {
		return new OVRInputState(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRInputState} instance allocated with {@link BufferUtils}. */
	public static OVRInputState create() {
		return new OVRInputState(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRInputState.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRInputState.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRInputState.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRInputState.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #TimeInSeconds}. */
	public static double nTimeInSeconds(long struct) { return memGetDouble(struct + OVRInputState.TIMEINSECONDS); }
	/** Unsafe version of {@link #ConnectedControllerTypes}. */
	public static int nConnectedControllerTypes(long struct) { return memGetInt(struct + OVRInputState.CONNECTEDCONTROLLERTYPES); }
	/** Unsafe version of {@link #Buttons}. */
	public static int nButtons(long struct) { return memGetInt(struct + OVRInputState.BUTTONS); }
	/** Unsafe version of {@link #Touches}. */
	public static int nTouches(long struct) { return memGetInt(struct + OVRInputState.TOUCHES); }
	/** Unsafe version of {@link #IndexTrigger}. */
	public static FloatBuffer nIndexTrigger(long struct) {
		return memFloatBuffer(struct + OVRInputState.INDEXTRIGGER, 2);
	}
	/** Unsafe version of {@link #IndexTrigger(int) IndexTrigger}. */
	public static float nIndexTrigger(long struct, int index) { return memGetFloat(struct + OVRInputState.INDEXTRIGGER + index * 4); }
	/** Unsafe version of {@link #HandTrigger}. */
	public static FloatBuffer nHandTrigger(long struct) {
		return memFloatBuffer(struct + OVRInputState.HANDTRIGGER, 2);
	}
	/** Unsafe version of {@link #HandTrigger(int) HandTrigger}. */
	public static float nHandTrigger(long struct, int index) { return memGetFloat(struct + OVRInputState.HANDTRIGGER + index * 4); }
	/** Unsafe version of {@link #Thumbstick}. */
	public static OVRVector2f.Buffer nThumbstick(long struct) {
		return OVRVector2f.createBuffer(struct + OVRInputState.THUMBSTICK, 2);
	}
	/** Unsafe version of {@link #Thumbstick(int) Thumbstick}. */
	public static OVRVector2f nThumbstick(long struct, int index) {
		return new OVRVector2f(struct + OVRInputState.THUMBSTICK + index * OVRVector2f.SIZEOF);
	}

	/** Unsafe version of {@link #TimeInSeconds(double) TimeInSeconds}. */
	public static void nTimeInSeconds(long struct, double value) { memPutDouble(struct + OVRInputState.TIMEINSECONDS, value); }
	/** Unsafe version of {@link #ConnectedControllerTypes(int) ConnectedControllerTypes}. */
	public static void nConnectedControllerTypes(long struct, int value) { memPutInt(struct + OVRInputState.CONNECTEDCONTROLLERTYPES, value); }
	/** Unsafe version of {@link #Buttons(int) Buttons}. */
	public static void nButtons(long struct, int value) { memPutInt(struct + OVRInputState.BUTTONS, value); }
	/** Unsafe version of {@link #Touches(int) Touches}. */
	public static void nTouches(long struct, int value) { memPutInt(struct + OVRInputState.TOUCHES, value); }
	/** Unsafe version of {@link #IndexTrigger(FloatBuffer) IndexTrigger}. */
	public static void nIndexTrigger(long struct, FloatBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(memAddress(value), struct + OVRInputState.INDEXTRIGGER, value.remaining() * 4);
	}
	/** Unsafe version of {@link #IndexTrigger(int, float) IndexTrigger}. */
	public static void nIndexTrigger(long struct, int index, float value) { memPutFloat(struct + OVRInputState.INDEXTRIGGER + index * 4, value); }
	/** Unsafe version of {@link #HandTrigger(FloatBuffer) HandTrigger}. */
	public static void nHandTrigger(long struct, FloatBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(memAddress(value), struct + OVRInputState.HANDTRIGGER, value.remaining() * 4);
	}
	/** Unsafe version of {@link #HandTrigger(int, float) HandTrigger}. */
	public static void nHandTrigger(long struct, int index, float value) { memPutFloat(struct + OVRInputState.HANDTRIGGER + index * 4, value); }
	/** Unsafe version of {@link #Thumbstick(OVRVector2f.Buffer) Thumbstick}. */
	public static void nThumbstick(long struct, OVRVector2f.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(value.address(), struct + OVRInputState.THUMBSTICK, value.remaining() * OVRVector2f.SIZEOF);
	}
	/** Unsafe version of {@link #Thumbstick(int, OVRVector2f) Thumbstick}. */
	public static void nThumbstick(long struct, int index, OVRVector2f value) { memCopy(value.address(), struct + OVRInputState.THUMBSTICK + index * OVRVector2f.SIZEOF, OVRVector2f.SIZEOF); }

	// -----------------------------------

	/** An array of {@link OVRInputState} structs. */
	public static final class Buffer extends StructBuffer<OVRInputState, Buffer> {

		/**
		 * Creates a new {@link OVRInputState.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRInputState#SIZEOF}, and its mark will be undefined.
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
		protected OVRInputState newInstance(long address) {
			return new OVRInputState(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code TimeInSeconds} field. */
		public double TimeInSeconds() { return nTimeInSeconds(address()); }
		/** Returns the value of the {@code ConnectedControllerTypes} field. */
		public int ConnectedControllerTypes() { return nConnectedControllerTypes(address()); }
		/** Returns the value of the {@code Buttons} field. */
		public int Buttons() { return nButtons(address()); }
		/** Returns the value of the {@code Touches} field. */
		public int Touches() { return nTouches(address()); }
		/** Returns a {@link FloatBuffer} view of the {@code IndexTrigger} field. */
		public FloatBuffer IndexTrigger() { return nIndexTrigger(address()); }
		/** Returns the value at the specified index of the {@code IndexTrigger} field. */
		public float IndexTrigger(int index) { return nIndexTrigger(address(), index); }
		/** Returns a {@link FloatBuffer} view of the {@code HandTrigger} field. */
		public FloatBuffer HandTrigger() { return nHandTrigger(address()); }
		/** Returns the value at the specified index of the {@code HandTrigger} field. */
		public float HandTrigger(int index) { return nHandTrigger(address(), index); }
		/** Returns a {@link OVRVector2f}.Buffer view of the {@code Thumbstick} field. */
		public OVRVector2f.Buffer Thumbstick() { return nThumbstick(address()); }
		/** Returns a {@link OVRVector2f} view of the struct at the specified index of the {@code Thumbstick} field. */
		public OVRVector2f Thumbstick(int index) { return nThumbstick(address(), index); }

		/** Sets the specified value to the {@code TimeInSeconds} field. */
		public OVRInputState.Buffer TimeInSeconds(double value) { nTimeInSeconds(address(), value); return this; }
		/** Sets the specified value to the {@code ConnectedControllerTypes} field. */
		public OVRInputState.Buffer ConnectedControllerTypes(int value) { nConnectedControllerTypes(address(), value); return this; }
		/** Sets the specified value to the {@code Buttons} field. */
		public OVRInputState.Buffer Buttons(int value) { nButtons(address(), value); return this; }
		/** Sets the specified value to the {@code Touches} field. */
		public OVRInputState.Buffer Touches(int value) { nTouches(address(), value); return this; }
		/** Copies the specified {@link FloatBuffer} to the {@code IndexTrigger} field. */
		public OVRInputState.Buffer IndexTrigger(FloatBuffer value) { nIndexTrigger(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code IndexTrigger} field. */
		public OVRInputState.Buffer IndexTrigger(int index, float value) { nIndexTrigger(address(), index, value); return this; }
		/** Copies the specified {@link FloatBuffer} to the {@code HandTrigger} field. */
		public OVRInputState.Buffer HandTrigger(FloatBuffer value) { nHandTrigger(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code HandTrigger} field. */
		public OVRInputState.Buffer HandTrigger(int index, float value) { nHandTrigger(address(), index, value); return this; }
		/** Copies the specified {@link OVRVector2f.Buffer} to the {@code Thumbstick} field. */
		public OVRInputState.Buffer Thumbstick(OVRVector2f.Buffer value) { nThumbstick(address(), value); return this; }
		/** Copies the specified {@link OVRVector2f} at the specified index of the {@code Thumbstick} field. */
		public OVRInputState.Buffer Thumbstick(int index, OVRVector2f value) { nThumbstick(address(), index, value); return this; }

	}

}