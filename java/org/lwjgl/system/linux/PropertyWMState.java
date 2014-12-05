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

/** Contents of the WM_STATE property. */
public final class PropertyWMState implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		STATE,
		ICON;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(2);

		SIZEOF = offsets(memAddress(offsets));

		STATE = offsets.get(0);
		ICON = offsets.get(1);
	}

	private final ByteBuffer struct;

	public PropertyWMState() {
		this(malloc());
	}

	public PropertyWMState(ByteBuffer struct) {
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

	public void setState(int state) { state(struct, state); }
	public void setIcon(long icon) { icon(struct, icon); }

	public int getState() { return state(struct); }
	public long getIcon() { return icon(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int state,
		long icon
	) {
		ByteBuffer propertywmstate = malloc();

		state(propertywmstate, state);
		icon(propertywmstate, icon);

		return propertywmstate;
	}

	public static void state(ByteBuffer propertywmstate, int state) { propertywmstate.putInt(propertywmstate.position() + STATE, state); }
	public static void icon(ByteBuffer propertywmstate, long icon) { PointerBuffer.put(propertywmstate, propertywmstate.position() + ICON, icon); }

	public static int state(ByteBuffer propertywmstate) { return propertywmstate.getInt(propertywmstate.position() + STATE); }
	public static long icon(ByteBuffer propertywmstate) { return PointerBuffer.get(propertywmstate, propertywmstate.position() + ICON); }

}