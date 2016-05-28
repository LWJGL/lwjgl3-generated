/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension introduces two new shader functions:
 * 
 * <ul>
 * <li><b>mbcntAMD</b> computes the number of bits set in the provided argument, masked with a thread mask which contains 1 for all active threads less
 * than the current thread within a wavefront.</li>
 * <li><b>ballotARB</b> returns a 64-bit mask which contains 1 if that thread within the wavefront passed true into the instruction, and 0 otherwise.</li>
 * </ul>
 */
public final class AMDShaderBallot {

	/** The extension specification version. */
	public static final int VK_AMD_SHADER_BALLOT_SPEC_VERSION = 1;

	/** The extension name. */
	public static final String VK_AMD_SHADER_BALLOT_EXTENSION_NAME = "VK_AMD_shader_ballot";

	private AMDShaderBallot() {}

}