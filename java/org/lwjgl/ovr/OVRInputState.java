/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Describes the complete controller input state, including Oculus Touch, and XBox gamepad. If multiple inputs are connected and used at the same time,
 * their inputs are combined.
 */
public final class OVRInputState implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

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
		IntBuffer offsets = memAllocInt(7);

		SIZEOF = offsets(memAddress(offsets));

		TIMEINSECONDS = offsets.get(0);
		CONNECTEDCONTROLLERTYPES = offsets.get(1);
		BUTTONS = offsets.get(2);
		TOUCHES = offsets.get(3);
		INDEXTRIGGER = offsets.get(4);
		HANDTRIGGER = offsets.get(5);
		THUMBSTICK = offsets.get(6);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVRInputState() {
		this(malloc());
	}

	public OVRInputState(ByteBuffer struct) {
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

	public OVRInputState setTimeInSeconds(double TimeInSeconds) { TimeInSeconds(struct, TimeInSeconds); return this; }
	public OVRInputState setConnectedControllerTypes(int ConnectedControllerTypes) { ConnectedControllerTypes(struct, ConnectedControllerTypes); return this; }
	public OVRInputState setButtons(int Buttons) { Buttons(struct, Buttons); return this; }
	public OVRInputState setTouches(int Touches) { Touches(struct, Touches); return this; }
	public OVRInputState setIndexTrigger(ByteBuffer IndexTrigger) { IndexTriggerSet(struct, IndexTrigger); return this; }
	public OVRInputState setIndexTrigger(int index, float IndexTrigger) { IndexTrigger(struct, index, IndexTrigger); return this; }
	public OVRInputState setHandTrigger(ByteBuffer HandTrigger) { HandTriggerSet(struct, HandTrigger); return this; }
	public OVRInputState setHandTrigger(int index, float HandTrigger) { HandTrigger(struct, index, HandTrigger); return this; }
	public OVRInputState setThumbstick(ByteBuffer Thumbstick) { ThumbstickSet(struct, Thumbstick); return this; }
	public OVRInputState setThumbstick(ByteBuffer Thumbstick, int index) { ThumbstickSet(struct, Thumbstick, index); return this; }

	public double getTimeInSeconds() { return TimeInSeconds(struct); }
	public int getConnectedControllerTypes() { return ConnectedControllerTypes(struct); }
	public int getButtons() { return Buttons(struct); }
	public int getTouches() { return Touches(struct); }
	public void getIndexTrigger(ByteBuffer IndexTrigger) { IndexTriggerGet(struct, IndexTrigger); }
	public void getHandTrigger(ByteBuffer HandTrigger) { HandTriggerGet(struct, HandTrigger); }
	public void getThumbstick(ByteBuffer Thumbstick) { ThumbstickGet(struct, Thumbstick); }
	public void getThumbstick(ByteBuffer Thumbstick, int index) { ThumbstickGet(struct, Thumbstick, index); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		double TimeInSeconds,
		int ConnectedControllerTypes,
		int Buttons,
		int Touches,
		ByteBuffer IndexTrigger,
		ByteBuffer HandTrigger,
		ByteBuffer Thumbstick
	) {
		ByteBuffer ovrinputstate = malloc();

		TimeInSeconds(ovrinputstate, TimeInSeconds);
		ConnectedControllerTypes(ovrinputstate, ConnectedControllerTypes);
		Buttons(ovrinputstate, Buttons);
		Touches(ovrinputstate, Touches);
		IndexTriggerSet(ovrinputstate, IndexTrigger);
		HandTriggerSet(ovrinputstate, HandTrigger);
		ThumbstickSet(ovrinputstate, Thumbstick);

		return ovrinputstate;
	}

	public static void TimeInSeconds(ByteBuffer ovrinputstate, double TimeInSeconds) { ovrinputstate.putDouble(ovrinputstate.position() + TIMEINSECONDS, TimeInSeconds); }
	public static void ConnectedControllerTypes(ByteBuffer ovrinputstate, int ConnectedControllerTypes) { ovrinputstate.putInt(ovrinputstate.position() + CONNECTEDCONTROLLERTYPES, ConnectedControllerTypes); }
	public static void Buttons(ByteBuffer ovrinputstate, int Buttons) { ovrinputstate.putInt(ovrinputstate.position() + BUTTONS, Buttons); }
	public static void Touches(ByteBuffer ovrinputstate, int Touches) { ovrinputstate.putInt(ovrinputstate.position() + TOUCHES, Touches); }
	public static void IndexTriggerSet(ByteBuffer ovrinputstate, ByteBuffer IndexTrigger) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(IndexTrigger, 2 * 4);
		}
		memCopy(memAddress(IndexTrigger), memAddress(ovrinputstate) + INDEXTRIGGER, IndexTrigger.remaining());
	}
	public static void IndexTrigger(ByteBuffer ovrinputstate, int index, float IndexTrigger) { ovrinputstate.putFloat(INDEXTRIGGER + index * 4, IndexTrigger); }
	public static void HandTriggerSet(ByteBuffer ovrinputstate, ByteBuffer HandTrigger) {
		if ( LWJGLUtil.CHECKS ) {
			checkBufferGT(HandTrigger, 2 * 4);
		}
		memCopy(memAddress(HandTrigger), memAddress(ovrinputstate) + HANDTRIGGER, HandTrigger.remaining());
	}
	public static void HandTrigger(ByteBuffer ovrinputstate, int index, float HandTrigger) { ovrinputstate.putFloat(HANDTRIGGER + index * 4, HandTrigger); }
	public static void ThumbstickSet(ByteBuffer ovrinputstate, ByteBuffer Thumbstick) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Thumbstick, 2 * OVRVector2f.SIZEOF);
		memCopy(memAddress(Thumbstick), memAddress(ovrinputstate) + THUMBSTICK, Thumbstick.remaining());
	}
	public static void ThumbstickSet(ByteBuffer ovrinputstate, ByteBuffer Thumbstick, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Thumbstick, OVRVector2f.SIZEOF);
		memCopy(memAddress(Thumbstick), memAddress(ovrinputstate) + THUMBSTICK + index * OVRVector2f.SIZEOF, Thumbstick.remaining());
	}

	public static double TimeInSeconds(ByteBuffer ovrinputstate) { return ovrinputstate.getDouble(ovrinputstate.position() + TIMEINSECONDS); }
	public static int ConnectedControllerTypes(ByteBuffer ovrinputstate) { return ovrinputstate.getInt(ovrinputstate.position() + CONNECTEDCONTROLLERTYPES); }
	public static int Buttons(ByteBuffer ovrinputstate) { return ovrinputstate.getInt(ovrinputstate.position() + BUTTONS); }
	public static int Touches(ByteBuffer ovrinputstate) { return ovrinputstate.getInt(ovrinputstate.position() + TOUCHES); }
	public static void IndexTriggerGet(ByteBuffer ovrinputstate, ByteBuffer IndexTrigger) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(IndexTrigger, 2 * 4);
		memCopy(memAddress(ovrinputstate) + INDEXTRIGGER, memAddress(IndexTrigger), IndexTrigger.remaining());
	}
	public static float IndexTrigger(ByteBuffer ovrinputstate, int index) {
		return ovrinputstate.getFloat(INDEXTRIGGER + index * 4);
	}
	public static void HandTriggerGet(ByteBuffer ovrinputstate, ByteBuffer HandTrigger) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(HandTrigger, 2 * 4);
		memCopy(memAddress(ovrinputstate) + HANDTRIGGER, memAddress(HandTrigger), HandTrigger.remaining());
	}
	public static float HandTrigger(ByteBuffer ovrinputstate, int index) {
		return ovrinputstate.getFloat(HANDTRIGGER + index * 4);
	}
	public static void ThumbstickGet(ByteBuffer ovrinputstate, ByteBuffer Thumbstick) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Thumbstick, 2 * OVRVector2f.SIZEOF);
		memCopy(memAddress(ovrinputstate) + THUMBSTICK, memAddress(Thumbstick), Thumbstick.remaining());
	}
	public static void ThumbstickGet(ByteBuffer ovrinputstate, ByteBuffer Thumbstick, int index) {
		if ( LWJGLUtil.CHECKS ) checkBufferGT(Thumbstick, OVRVector2f.SIZEOF);
		memCopy(memAddress(ovrinputstate) + THUMBSTICK + index * OVRVector2f.SIZEOF, memAddress(Thumbstick), Thumbstick.remaining());
	}

}